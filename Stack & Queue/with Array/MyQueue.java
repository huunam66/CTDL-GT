public class MyQueue implements IStackQueue{
    
    public static final int SIZE = 5;
    private int[] bucket;
    private int head;
    private int tail;

    public MyQueue(){
        this.bucket = new int[SIZE];
        init();
    }

    public void init(){
        head = tail = -1;
    }

    @Override
    public boolean isEmpty(){
        return head == -1 && tail == -1;
    }

    @Override
    public boolean isFull(){
        return tail == SIZE - 1;
    }


    @Override
    public boolean push(int value){
        if(isFull()){
            System.out.println("\nQueue is fully !");
            return false;
        }
        if(isEmpty()) head++;

        tail++;
        bucket[tail] = value;
        return true;
    }

    @Override
    public int pop(){
        if(isEmpty()){
            System.out.println("\nQueue is empty !");
            return head;
        }

        int num = bucket[head];
        
        for(int i = head; i < tail; i++){
            bucket[i] = bucket[i+1];
        }

        tail--;
        if(tail == -1) init();

        return num;
    }

    @Override
    public void show(){
        System.out.println();
        if(head != -1){
            for(int i = head; i <= tail; i++){
                System.out.printf("%d -> ", bucket[i]);
            }
        }

        System.out.printf(" %s", "NULL");
    }
}
