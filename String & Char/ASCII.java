public class ASCII{

    // đằng sau một kí tự chính là một mã ASCII 
    // -> integer có thể so sánh với character

    public static void main(String[] args) {
        String s = "Hello world !";

        int len = s.length();
        int cp = 0;
        while(len-- > 0){
            char c = s.charAt(len);
            System.out.println((int)c + " ");
            cp += (int)c;
        }

        System.out.println();
        System.out.println(cp);


        String s1 = s;
        s1+="d";
        System.out.println("s: " + s);
        System.out.println("s1: " + s1);
    }
}