package StoryBased;

import java.util.*;

public class TheSunnyStreak {

    public static int findMaxConsecutiveOnes(int N, int[] arr) {
        // Write your easy streak-counting magic here
        int max = 0;
        int count = 0;
        for(int i = 0 ; i<N ; i++){
            if(arr[i]==1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count = 0;
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

        System.out.println(findMaxConsecutiveOnes(N, A));
        sc.close();
    }
}