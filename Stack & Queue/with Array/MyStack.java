public class MyStack implements IStackQueue{
    public static final int SIZE = 5;
    private int[] bucket;
    private int head;


    public MyStack() {
        this.bucket = new int[SIZE]; 
        init();
    }

    private void init(){
        head = -1;
    }


    @Override
    public boolean isEmpty(){
        return head == -1;
    }

    @Override
    public boolean isFull(){
        return head == SIZE - 1;
    }

    @Override
    public boolean push(int value){
        if(isFull()){
            System.out.println("\nStack is fully !");
            return false;
        }

        head++;
        bucket[head] = value;
        return true;
    }

    @Override
    public int pop(){
        if(isEmpty()){
            System.out.println("\nStack is empty !");
            return head;
        }

        return bucket[head--];
    }

    @Override
    public void show(){
        System.out.println();
        for(int i = 0; i <= head; i++){
            System.out.printf("%d -> ", bucket[i]);
        }
        System.out.printf(" %s", "NULL");
    }

}
