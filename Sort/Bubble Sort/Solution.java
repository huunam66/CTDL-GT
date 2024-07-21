import java.util.Arrays;

public class Solution{

    public static void BubbleSort(int[] arr){
        int n = arr.length;
        while(n-- > 0){
            int countSwap = 0;
            for(int i = 0; i < n; i++){ 
                if(arr[i] > arr[i + 1]){
                    countSwap++;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            System.out.println(Arrays.toString(arr));
            if(countSwap <= 1) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 7, 8};

        BubbleSort(arr);
    }
}