import java.io.IOException;
import java.io.OutputStream;

public class BitOutputStream implements AutoCloseable {
    private final OutputStream out;
    private int currentByte = 0;
    private int numBitsInCurrent = 0;
    private long writtenBits = 0;

    public BitOutputStream(OutputStream out) {
        this.out = out;
    }

    public void writeBit(int bit) throws IOException {
        if (bit != 0) {
            currentByte |= (1 << (7 - numBitsInCurrent));
        }

        numBitsInCurrent++;
        writtenBits++;

        if (numBitsInCurrent == 8) {
            flushCurrentByte();
        }
    }

    public void writeBits(String bits) throws IOException {
        for (char c : bits.toCharArray()) {
            writeBit(c == '1' ? 1 : 0);
        }
    }

    private void flushCurrentByte() throws IOException {
        if (numBitsInCurrent == 8) {
            out.write(currentByte);
            currentByte = 0;
            numBitsInCurrent = 0;
        }
    }

    public void flush() throws IOException {
        if (numBitsInCurrent > 0) { 
            out.write(currentByte);
            currentByte = 0;
            numBitsInCurrent = 0;
        }
        out.flush();
    }

    public long getWrittenBits() {
        return writtenBits;
    }

    @Override
    public void close() throws IOException {
        flush();
        out.close();
    }
}
