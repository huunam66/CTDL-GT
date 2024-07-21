public class Solution {
    public static boolean isPalindrome(int x) {
        if(x == 0) return true;
        if(x < 0) return false;

        int n = x / 10;
        int result = x % 10;
        while(n != 0){
            result = result * 10 + n % 10;
            n/=10;
        }

        return x == result;
    }

    public static void main(String[] args) {
        int x = -121;
        isPalindrome(x);
    }
    
}
