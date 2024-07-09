import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(j >= 0){
            // System.out.println(Arrays.toString(nums1));
            // System.out.println("i: " + nums1[i] + " ~ j: " + nums2[j]);
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
                
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static int countElement(int[] nums){
        if(nums.length == 0) return 0;
        
        int count = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] != 0) count++;
        }

        return count;
    }
    

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = countElement(nums1);
        int n = countElement(nums2);

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    
}
