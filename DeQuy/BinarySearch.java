import java.util.Arrays;

public class BinarySearch {

    // Use recursive
    public static int BSearch(int[] arr, int searchVal, int start, int end){

        if(start > end) return -1;
        
        if(arr[start] == searchVal) return start;
        if(arr[end] == searchVal) return end;
        
        int mid = (start + end) / 2;
        if(arr[mid] == searchVal) return mid;
        
        if(searchVal > arr[mid]){   
            start = mid + 1;
            return BSearch(arr, searchVal, start, end);
        }

        end = mid - 1;
        return BSearch(arr, searchVal, start, end);
    }

    // Unuse recursive
    public static int BSearch(int[] arr, int searchVal){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            if(arr[start] == searchVal) return start;
            if(arr[end] == searchVal) return end;

            int mid = (start + end) / 2;
            if(arr[mid] == searchVal) return mid;

            if(searchVal > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }

    public static void InsertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i - 1]) continue;

            int num_i = arr[i];
            int j = i - 1;
            while(j >=0 && arr[j] > num_i){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = num_i;
        }
    }

    public static void main(String[] args) {
        int[] arr = {31,46,50,57,72,25,19,12,9,4,1};

        System.out.println(Arrays.toString(arr));

        InsertSort(arr);

        System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        System.out.println("Length arr: " + end);
        int searchVal = 31;

        System.out.println("Search value: " + searchVal);
        int searchResult = BSearch(arr, searchVal, start, end);
        System.out.println("Use recursive: " + searchResult);
        searchResult = BSearch(arr, searchVal);
        System.out.println("Unuse recursive: " + searchResult);
    }   
    
}
