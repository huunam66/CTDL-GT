import java.util.Arrays;

public class Fibonacci{


    public static void init_Fibonacci(int[] arr, int n){
        if(n > 0) init_Fibonacci(arr, n - 1);
        
        if(n <= 1) {
            arr[n] = 1;
            return;
        }
        
        arr[n] = arr[n - 1] + arr[n - 2];
    }

    // Recursive return value
    public static int num_Fibonacii_At(int n){
        if(n <= 2) return 1;

        return num_Fibonacii_At(n - 1) + num_Fibonacii_At(n - 2);
    }

    // Recursive not return value
    public static void num_Fibonacii_At(int[] arr, int n){
        if(n <= 1){
            arr[0] = 1;
            arr[1] = 1;
            return;
        }

        num_Fibonacii_At(arr, n - 1);
        arr[n] = arr[n - 1] + arr[n - 2]; 
    }

    public static void main(String[] args){
        int n = 100;
        int[] arr;
        // init_Fibonacci(arr = new int[n], n - 1);

        // System.out.println(Arrays.toString(arr));

        // System.out.println(num_Fibonacii_At(6));

        num_Fibonacii_At(arr = new int[n], 6);
        
        // System.out.println(Arrays.toString(arr));
        System.out.println(arr[6]);
    }
}