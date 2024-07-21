public class TinhGiaiThua {
    

    public static int GiaiThua(int num){
        if(num <= 1) return 1;

        return num * GiaiThua(num - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        int result = GiaiThua(num);
        System.out.println(result);
    }
}
