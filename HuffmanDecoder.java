import java.io.*;
import java.util.PriorityQueue;

public class HuffmanDecoder {
    public static void decompress(File inputFile, File outputFile) throws Exception {
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFile)))) {

            long originalLength = dis.readLong();
            long totalBits = dis.readLong();

            int[] freq = new int[256];
            for (int i = 0; i < 256; i++) {
                freq[i] = dis.readInt();
            }

            Node root = buildTree(freq);
            if (root == null) {
                try (FileOutputStream fos = new FileOutputStream(outputFile)) {} // создаём пустой файл, даже если ничего не было
                return;
            }

            try (BitInputStream bis = new BitInputStream(dis);
                FileOutputStream fos = new FileOutputStream(outputFile)) {
                    Node node = root;
                    long bitsRead = 0;
                    long bytesWritten = 0;

                    while (bitsRead < totalBits && bytesWritten < originalLength) {
                        int bit = bis.readBit();
                        if (bit == -1) {
                            break;
                        }

                        bitsRead++;

                        node = (bit == 0) ? node.left : node.right;

                        if (node.isLeaf()) {
                            fos.write((byte) node.symbol);
                            bytesWritten++;
                            node = root;
                        }
                    }
            }
        }
    }

    private static Node buildTree(int[] freq) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (int i = 0; i < freq.length; i++)
            if (freq[i] > 0)
                pq.add(new Node(i, freq[i], null, null));

        if (pq.isEmpty())
            return null;

        if (pq.size() == 1) {  // крайний случай (1 символ)
            Node only = pq.poll();
            Node fake = new Node(-1, 0, null, null);
            return new Node(-1, only.freq, only, fake);
        }

        while (pq.size() > 1) {
            Node a = pq.poll();
            Node b = pq.poll();
            pq.add(new Node(-1, a.freq + b.freq, a, b));
        }

        return pq.poll();
    }
}
