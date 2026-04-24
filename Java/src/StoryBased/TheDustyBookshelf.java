package StoryBased;

import java.util.*;

public class TheDustyBookshelf {

    public static void moveZeroes(int N, int[] arr) {
        // Write your easy cleaning magic here
        int idx = 0;
        for(int i = 0 ; i<N ; i++){
            if(arr[i] != 0){
                arr[idx] = arr[i];
                idx++;
            }
        }
        for(int i = idx ; i<N ; i++){
            arr[i] = 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        moveZeroes(N, A);
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}