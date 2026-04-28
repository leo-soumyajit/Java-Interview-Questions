package StoryBased;

import java.util.*;

public class TheBlacksmithsBucket {

    public static int countRefills(int n, int w, int[] arr) {
        // Write your clever state-tracking magic here
//        n = 5
//        w = 5
//        4 3 2 4 1
        int r = 0;
        int val = w;
        for (int i = 0 ; i<arr.length ; i++){
            if(arr[i]>val){
                r++;
                val = w;
            }
            val = val - arr[i];

        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] swords = new int[N];
        for (int i = 0; i < N; i++) {
            swords[i] = sc.nextInt();
        }

        System.out.println(countRefills(N, W, swords));
        sc.close();
    }
}