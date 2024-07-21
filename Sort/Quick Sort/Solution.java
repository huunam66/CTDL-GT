import java.util.Arrays;

public class Solution{

    public void QuickSort(int[] arr, int L, int R){
        if(L >= R) return;

        int iL = L;
        int iR = R;
        
        int iK = (L+R)/2;
        int K = arr[iK];

        while(iL < iR){
            while(arr[iL] < K) iL++;
            while(arr[iR] > K) iR--;

            // System.out.println("K: " + K);
            // System.out.println("IL: " + iL);
            // System.out.println("IR: " + iR);
            // System.out.println(Arrays.toString(Arrays.copyOfRange(arr, L, R + 1)));
            int numL = arr[iL];
            int numR = arr[iR];
            if(iL < iR){
                arr[iL] = numR;
                arr[iR] = numL;
                iL++;
                iR--;
            }
        }

        QuickSort(arr, L, iK);
        QuickSort(arr, iK + 1, R);
    }


    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 6, 4, 32, 5, 6, 6};

        Solution s= new Solution();
        int L = 0;
        int R = arr.length - 1;
        s.QuickSort(arr, L, R);
        
        System.out.println(Arrays.toString(arr));
    }
}