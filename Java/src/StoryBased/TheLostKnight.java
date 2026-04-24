package StoryBased;
import java.util.*;

public class TheLostKnight {

    public static int findMissingKnight(int N, int[] arr) {
        // Write your clever search magic here
        int ans = N;
        for(int i = 0 ; i<arr.length ; i++){
            ans += i - arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N is the size of the array. The actual knights were from 0 to N.
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(findMissingKnight(N, A));
        sc.close();
    }
}