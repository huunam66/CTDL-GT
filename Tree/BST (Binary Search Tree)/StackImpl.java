

public class StackImpl implements IStack {
    private final int SIZE_DEFAULT;
    private Node[] stack;
    private int SIZE;

    public StackImpl(int SIZE){
        SIZE_DEFAULT = SIZE;
        stack = new Node[SIZE_DEFAULT];
        this.SIZE = 0;
    }


    @Override
    public int SIZE() {
        return SIZE;
    }


    @Override
    public Node pop() {
        if(SIZE == 0) return null;

        Node popNode = stack[SIZE - 1];
        stack[SIZE - 1] = null;
        SIZE--;
        return popNode;
    }


    @Override
    public Node peek() {
        if(SIZE == 0) return null;
        return stack[SIZE];
    }


    @Override
    public boolean push(Node node) {
        if(SIZE == SIZE_DEFAULT - 1) return false;

        stack[SIZE + 1] = node;
        SIZE++;
        return true;
    }
}
