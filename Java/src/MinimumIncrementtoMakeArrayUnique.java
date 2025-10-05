import java.util.Arrays;

public class MinimumIncrementtoMakeArrayUnique {
    public static int minIncrementForUnique(int[] arr) {
       Arrays.sort(arr);
       int ans = 0;
       for (int i = 1 ; i< arr.length ; i++){
           if(arr[i-1]>=arr[i]){
               ans += arr[i-1]-arr[i] + 1;
               arr[i] = arr[i-1]+1;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(arr));

    }
}
