package StoryBased;

import java.util.*;

public class TheDesertOases {
//00100010
    public static int longestBoundedSand(int N, int[] arr) {
        // Write your clever state-tracking magic here
        int max = 0;
        int count = 0;
        boolean is_One = false;
        for(int i = 0 ; i<N ; i++){
            if(arr[i]==1){
                is_One=true;
                max = Math.max(count,max);
                count=0;
            }
            else if (is_One){
                if(arr[i]==0){
                    count++;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] terrain = new int[N];
        for (int i = 0; i < N; i++) {
            terrain[i] = sc.nextInt();
        }

        System.out.println(longestBoundedSand(N, terrain));
        sc.close();
    }
}
