import java.util.Arrays;

public class Solution{


    public static void SelectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int jMin = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[jMin]){
                    jMin = j;
                }
            }
            if(arr[i] > arr[jMin]){
                int temp = arr[i];
                arr[i] = arr[jMin];
                arr[jMin] = temp;
            }

            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 8, 1, 2};
        SelectionSort(arr);
    }
}