public class Max {


    // return Max resursive
    public static int MaxVal(int[] arr, int i){
        if(i >= arr.length) return arr[arr.length - 1];

        int value = MaxVal(arr, i + 1);
        
        return arr[i] > value ? arr[i] : value; 
    }

    // not return Max resursive
    public static void MaxVal(int[] arr, int i, int max){
        if(i >= arr.length) return;

        MaxVal(arr, i + 1, max);

        if(arr[i] > max) max = arr[i];
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 11, 3, 4 ,5 ,16, 9};

        int begin = 0;
        int max = MaxVal(nums, begin);
        System.out.println("return Max resursive: " + max);

        MaxVal(nums, begin, nums[begin]);

        System.out.println("not return Max resursive: " + max);

    }
    
}
