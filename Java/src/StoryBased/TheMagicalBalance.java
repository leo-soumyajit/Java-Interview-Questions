package StoryBased;

import java.util.*;

public class TheMagicalBalance {

    public static int findPivotIndex(int N, int[] A) {
        // Write your code here
        int sum = 0;
        for(int i = 0 ; i<N ; i++){
            sum += A[i];
        }
        int st = 0;
        int end = sum;
        for(int i = 0 ; i<N ; i++){
            st += A[i];
            if(st==end)return i;
            end-=A[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(findPivotIndex(N, A));
        sc.close();
    }
}