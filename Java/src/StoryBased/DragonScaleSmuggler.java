package StoryBased;

import java.util.*;

public class DragonScaleSmuggler {

    public static int maxProfit(int N, int[] P) {
        // Write your clever smuggler logic here
        int max = 0;
        int minSofa = P[0];
        for(int i = 0 ; i<N ; i++){
            minSofa = Math.min(minSofa,P[i]);
            int maxS = P[i]-minSofa;
            max = Math.max(max,maxS);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        System.out.println(maxProfit(N, P));
        sc.close();
    }
}