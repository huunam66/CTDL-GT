// [^a-zA-Z0-9]
public class Solution {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").replaceAll(" ", "").toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        char[] cs = s.toCharArray();
        while(i < j){
            if(cs[i] != cs[j]) 
                return false;
            i++;
            j--;
        }

        return true;
    }


   public static void main(String[] args) {
        System.err.println(isPalindrome("A man, a plan, a canal: Panama"));
   } 
}
