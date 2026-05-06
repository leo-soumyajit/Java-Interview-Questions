package StoryBased;

import java.util.*;

public class TheSleepyNightGuard {

    public static int calculateMissedThefts(int N, int[] arr) {
        // Write your completely unique state-machine magic here
        int d = 0;
        int t = 0;
        for(int i = 0 ; i<N ; i++){
            if(arr[i]==0){
                d+=1;
            }
            else if(arr[i]>0 && d>=3){
                d = 0;
                t++;
            }
            else{
                d=0;
            }

        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] noises = new int[N];
        for (int i = 0; i < N; i++) {
            noises[i] = sc.nextInt();
        }

        System.out.println(calculateMissedThefts(N, noises));
        sc.close();
    }
}