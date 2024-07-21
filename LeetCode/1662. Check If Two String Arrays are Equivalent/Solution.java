import java.util.Arrays;

public class Solution{

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new  StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int i = 0;
        int j = 0;
        while(true){
            if(i >= word1.length && j >= word2.length) break;

            if(i < word1.length) sb1.append(word1[i]);

            if(j < word2.length) sb2.append(word2[j]);

            i++;
            j++;
        }
        
        return sb1.toString().equals(sb2.toString());
    }


    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"}; 
        String[] word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1, word2));

    }
}