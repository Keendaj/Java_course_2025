public class Node implements Comparable<Node>{
    public final int symbol;
    public final long freq;
    public final Node left;
    public final Node right;


    public Node(int symbol, long freq, Node left, Node right) {
        this.symbol = symbol;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }


    public boolean isLeaf() {
        return left == null && right == null;
    }


    @Override
    public int compareTo(Node otherNode) {
    
        int cmp = Long.compare(this.freq, otherNode.freq);
    
        if (cmp != 0){
            return cmp;
        }

        return Integer.compare(this.symbol, otherNode.symbol);
    }
}