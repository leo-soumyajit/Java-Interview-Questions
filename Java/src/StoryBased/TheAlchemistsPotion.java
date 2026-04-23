package StoryBased;

import java.util.*;

public class TheAlchemistsPotion {

    public static long findMaxPower(int N, int K, int[] A) {
        // Write your code here
        long sum = 0;
        long max = 0;
        for(int i = 0 ; i<K ; i++){
            sum+=A[i];
        }
        max = Math.max(max,sum);
        for(int i = K ; i<N ; i++){
            sum += A[i] - A[i-K];
            max = Math.max(max,sum);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(findMaxPower(N, K, A));
        sc.close();
    }
}