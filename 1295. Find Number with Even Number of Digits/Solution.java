public class Solution {

    public static int findNumbers(int[] nums) {
        if(nums.length == 0) return 0;

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int cNum = 0;
            int num = nums[i];
            while(num != 0){
                num /= 10;
                cNum++;
            }
            if(cNum % 2 == 0) count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] numbers = {12,345,2,6,7896};
        System.out.println(findNumbers(numbers));
        
    }
    
}
