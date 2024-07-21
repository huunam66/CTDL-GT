public interface IStackQueue {

    boolean push(int value);

    int pop();

    boolean isEmpty();

    boolean isFull();

    void show();
}