import java.util.Arrays;

public class Solution {

    // public static void MergeSort(int[] arr, int start, int end){
    //     // System.out.println(start + " -> " + end);
    //     // System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)));

    //     if(start >= end) return;

    //     int mid = (start + end) / 2;
        
    //     int endStart = mid;
    //     int startEnd = mid + 1;
    //     MergeSort(arr, start, endStart);
    //     MergeSort(arr, startEnd, end);
        
    //     sort(arr, start, end);
    //     System.out.println(start + " -> " + end);
    //     System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)));
    // }

    // public static void sort(int[] arr, int start, int end){
    //     for(int i = start + 1; i <= end; i++){
    //         if(arr[i] >= arr[i - 1]) continue;  

    //         int num_i = arr[i];
    //         int j = i - 1;
    //         while(j >= start && arr[j] > num_i){
    //             arr[j + 1] = arr[j];
    //             j--;
    //         }

    //         arr[j + 1] = num_i;
    //     }
    // }

    public int[] Merge(int[] a1, int[] a2){
        
        int n = a1.length + a2.length;
        int[] mergeArray = new int[n];

        int i1 = a1.length - 1;
        int i2 = a2.length - 1;
        
        while(n-- > 0){
            if(i1 >= 0 && i2 >= 0){

                if(a1[i1] > a2[i2]) mergeArray[n] = a1[i1--];

                else mergeArray[n] = a2[i2--];   

            }
            else{

                if(i1 >= 0) mergeArray[n] = a1[i1--];
    
                if(i2 >= 0) mergeArray[n] = a2[i2--];
            }
        }
        
        return mergeArray;
    }


    public int[] MergeSort(int[] arr, int start, int end){
        if(start > end) return new int[0];
        if(start == end) return new int[]{arr[start]};
        
        int mid = (start + end) / 2;
        int endStart = mid;
        int startEnd = mid + 1;

        int[] a1 = MergeSort(arr, start, endStart);
        int[] a2 = MergeSort(arr, startEnd, end);
 
        return Merge(a1, a2);
    }

    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        return MergeSort(nums, start, end);
    }


    public static void main(String[] args) {
        int arr[] = {5, 3, 5, 6, 4, 32, 5, 6, 6};

        Solution s = new Solution();

        int[] resultMerge = s.sortArray(arr);
        System.out.println(Arrays.toString(resultMerge));
    }    
}
