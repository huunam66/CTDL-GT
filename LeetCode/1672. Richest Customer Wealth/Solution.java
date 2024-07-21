public class Solution{

    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int max = 0;
        while(m-- > 0){
            int amount_money = 0;
            int n = accounts[m].length;
            
            while(n-- > 0) amount_money += accounts[m][n];

            if(amount_money > max) max = amount_money;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};

        System.out.println(maximumWealth(accounts));
    }
}