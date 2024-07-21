import java.util.Arrays;

public class Solution{


    public static void InsertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1]) continue;

            int num = arr[i];
            int j = i - 1;
            
            while(j >= 0 && arr[j] > num){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = num;
            
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 8, 1, 2};

        InsertSort(arr);

    }
}