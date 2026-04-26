package StoryBased;

import java.util.*;

public class TheMagneticMonoliths {

    public static int countDominantStones(int N, int[] arr) {
        // Write your clever array traversal magic here
        int count = 0;
        if(N==1)return 1;
        if(Math.abs(arr[0])>Math.abs(arr[1]))count++;
        if(Math.abs(arr[N-1])>Math.abs(arr[N-2]))count++;

        for (int i = 1 ; i<N-1 ; i++){
            if(Math.abs(arr[i])>Math.abs(arr[i-1])+Math.abs(arr[i+1])){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] stones = new int[N];
        for (int i = 0; i < N; i++) {
            stones[i] = sc.nextInt();
        }

        System.out.println(countDominantStones(N, stones));
        sc.close();
    }
}