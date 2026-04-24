package StoryBased;

import java.util.*;

public class CursedGoldMine {

    public static int maxGold(int N, int[] A) {
        // Write your clever mining logic here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<N ; i++){
            sum += A[i];
            if(max < sum){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(maxGold(N, A));
        sc.close();
    }
}
