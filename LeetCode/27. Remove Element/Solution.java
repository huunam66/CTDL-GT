import java.util.Arrays;

public class Solution {

    // Input: nums = [0,1,2,2,3,0,4,2], val = 2
    // Output: 5, nums = [0,1,4,0,3,_,_,_]

    public static int removeElement_1(int[] nums, int val) {
        int k = 0;
        final int empty = -1;
        int iSwap = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val && nums[i] != empty) k++;

            if(nums[i] == val){
                if(i == nums.length - 1){
                    nums[i] = empty;
                    continue;
                }

                for(int j = iSwap; j > i; j--){
                    if(nums[j] != val && nums[j] != empty){
                        nums[i] = nums[j];
                        nums[j] = empty;
                        iSwap = j;
                        k++;
                        break;
                    }
                }
            }
        }
        
    // System.out.println(Arrays.toString(nums));
        return k;
    }

    public static int removeElement_2(int[] nums, int val) {
        int k = 0;
        int i = 0;

        while(i < nums.length){
            if(nums[i] != 2) nums[k++] = nums[i];
            i++;
        }

        System.out.println(Arrays.toString(nums));

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.err.println(removeElement_2(nums, val));
    }
}
