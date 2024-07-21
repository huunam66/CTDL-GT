import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        IStackQueue Stack = new MyStack();

        System.out.println("\nSTACK");

        for(int i = 0; i < MyStack.SIZE + 1; i++){
            Stack.push(random.nextInt(1, 10));
        }

        Stack.show();
        Stack.pop();
        Stack.show();
        Stack.pop();
        Stack.show();
        Stack.pop();
        Stack.show();
        Stack.pop();
        Stack.show();
        Stack.pop();
        Stack.show();
        Stack.pop();
        Stack.show();
        for(int i = 0; i < MyStack.SIZE + 1; i++){
            Stack.push(random.nextInt(1, 10));
        }

        Stack.show();

        
        System.out.println("\nQUEUE");

        IStackQueue Queue = new MyQueue();

        for(int i = 0; i < MyStack.SIZE + 1; i++){
            Queue.push(random.nextInt(1, 10));
        }

        Queue.show();
        Queue.pop();
        Queue.show();
        Queue.pop();
        Queue.show();
        Queue.pop();
        Queue.show();
        Queue.pop();
        Queue.show();
        Queue.pop();
        Queue.show();
        Queue.pop();
        Queue.show();
        for(int i = 0; i < MyQueue.SIZE + 1; i++){
            Queue.push(random.nextInt(1, 10));
        }

        Queue.show();
    }
    
}
