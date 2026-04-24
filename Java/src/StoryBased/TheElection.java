package StoryBased;

import java.util.*;

public class TheElection {

    public static int findWinner(int N, int[] arr) {
        // Write your clever vote-counting magic here
        int cand = arr[0], pts = 0;
        for(int i = 0 ; i<N ; i++){
            if(pts == 0){
                cand = arr[i];
            }
            if(cand == arr[i]){
                pts++;
            }else{
                pts--;
            }
        }
        return cand;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(findWinner(N, A));
        sc.close();
    }
}
