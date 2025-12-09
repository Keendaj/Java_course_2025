import java.io.File;

public class Huffman {

    private static void help() {
        System.out.println(
            "help:\n" +
            "  java Huffman -c <input> <output> <-- compress\n" +
            "  java Huffman --compress <input> <output> <-- compress\n" +
            "  java Huffman -d <input> <output> <-- decompress\n" +
            "  java Huffman --decompress <input> <output> <-- decompress\n" +
            "  java Huffman -h <-- shows this text"
        );
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            help();
            return;
        }

        switch (args[0]) {

            case "-c":
            case "--compress":
                if (args.length < 3) {
                    help();
                    return;
                }
                File in = new File(args[1]);
                File out = new File(args[2]);
                HuffmanEncoder.compress(in, out);
                System.out.println("Compressed: " + in.getName() + " -> " + out.getName());
                break;

            case "-d":
            case "--decompress":
                if (args.length < 3) {
                    help();
                    return;
                }
                File in2 = new File(args[1]);
                File out2 = new File(args[2]);
                HuffmanDecoder.decompress(in2, out2);
                System.out.println("Decompressed: " + in2.getName() + " -> " + out2.getName());
                break;

            case "-h":
            case "--help":
                help();
                break;

            default:
                help();
        }
    }
}
