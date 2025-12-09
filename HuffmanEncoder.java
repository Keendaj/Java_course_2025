import java.io.*;
import java.util.*;


public class HuffmanEncoder {
    public static void compress(File inputFile, File outputFile) throws IOException {
        byte[] data = readAllBytes(inputFile);
        long originalLength = data.length;

        int[] freq = new int[256];
        for (byte b : data) {
            freq[Byte.toUnsignedInt(b)]++;
        }

        Node root = buildTree(freq);
        if (root == null) {
            try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)))) {
                dos.writeLong(0L);
                dos.writeLong(0L);
                
                for (int i = 0; i < 256; i++) {
                    dos.writeInt(0);
                }
            }

            return;
        }

        String[] codes = new String[256];
        buildCodes(root, "", codes);

        long totalBits = 0;
        for (byte b : data) {
            totalBits += codes[Byte.toUnsignedInt(b)].length();
        } 


        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)))) {
            dos.writeLong(originalLength);
            dos.writeLong(totalBits);
            
            for (int i = 0; i < 256; i++) { 
                dos.writeInt(freq[i]);
            }
            
            dos.flush();

            try (BitOutputStream bos = new BitOutputStream(dos)) {
                for (byte b : data) {
                    String code = codes[Byte.toUnsignedInt(b)];
                    bos.writeBits(code);
                }
                
                bos.flush();
            }
        }
    }


    private static Node buildTree(int[] freq) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                pq.add(new Node(i, freq[i], null, null));
            }
        }
        
        if (pq.isEmpty()){
            return null;   
        }
        
        if (pq.size() == 1) {
            Node only = pq.poll();
            Node fake = new Node(-1, 0, null, null);
            Node parent = new Node(-1, only.freq, only, fake);
            return parent;
        }
        
        while (pq.size() > 1) {
            Node a = pq.poll();
            Node b = pq.poll();
            Node parent = new Node(-1, a.freq + b.freq, a, b);
            pq.add(parent);
        }

        return pq.poll();
    }

    private static void buildCodes(Node node, String prefix, String[] codes) {
        if (node.isLeaf()) {
            int index = node.symbol & 0xFF;

            if (prefix.isEmpty()) {
                codes[index] = "0";
            } 
            else {
                codes[index] = prefix;
            }

            return;
        }
        
        buildCodes(node.left, prefix + '0', codes);
        buildCodes(node.right, prefix + '1', codes);
    }

    private static byte[] readAllBytes(File f) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); FileInputStream fis = new FileInputStream(f)) {
            byte[] buf = new byte[8192];
            int r;
            
            while ((r = fis.read(buf)) != -1) {
                baos.write(buf, 0, r);
            }
            
            return baos.toByteArray();
        }
    }
}