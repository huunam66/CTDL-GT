import java.util.HashMap;
import java.util.Map;

public class Solution{


    public static int firstUniqChar_1(String s) {
        int i = -1;
        while(i++ < s.length() - 1){
            char ci = s.charAt(i);
            int j = -1;
            while(j++ < i - 1){
                if(s.charAt(j) == ci) break;
            }
            if(j == i){
                boolean isExisted = false;
                j = s.length();
                while(j-- > i + 1){
                    char cj = s.charAt(j);
                    if(ci == cj){
                        isExisted = true;
                        break;
                    }
                }
                if(!isExisted) return i;
            }
        }
        
        return -1;
    }

    public static int firstUniqChar_2(String s) {
        int[] countChar = new int[26];
        for(char c : s.toCharArray()){
            countChar[c - 'a']++;
        }
        int h = -1;
        while(h++ < s.length() - 1){
            if(countChar[s.charAt(h) - 'a'] == 1) 
                return h; 
        }
        return -1;
    }

    public static int firstUniqChar_3(String s) {
        char[] cs = s.toCharArray();
        Map<Character, Integer> mp = new HashMap<>(); 

        for(char c : cs){
            Integer val = mp.get(c);
            if(val == null) mp.put(c, 1);
            else mp.put(c, val + 1);
        }

        for(int i = 0; i < cs.length; i++) if(mp.get(cs[i]) == 1) return i;

        return -1;
    }


    public static void main(String[] args) {
        String s = "leetcode";

        // System.out.println(firstUniqChar_1(s));

        // char c= ' ';
        // System.out.println((int)c);
        // System.out.println(firstUniqChar_2(s));
        System.out.println(firstUniqChar_3(s));
    }
}