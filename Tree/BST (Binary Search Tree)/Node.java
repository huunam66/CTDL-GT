/**
 * Node
 */
public class Node implements Comparable<Node>{

    private int value;
    private Node Left;
    private Node Right;

    public Node(int value){
        this(value, null, null);
    }

    public Node(int value, Node Left, Node Right){
        this.value = value;
        this.Left = Left;
        this.Right = Right;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Node)) return false;
        return this == obj;
    }
    


    @Override
    public int compareTo(Node o) {

        if(value > o.value) return 1;
        if(value < o.value) return -1;

        return 0;
    }

    @Override
    public String toString() {
        return value + " -> ";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return Left;
    }

    public void setLeft(Node left) {
        Left = left;
    }

    public Node getRight() {
        return Right;
    }

    public void setRight(Node right) {
        Right = right;
    }
}