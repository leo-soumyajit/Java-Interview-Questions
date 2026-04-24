package StoryBased;

import java.util.*;

public class AlchemistsGemVault {

    public static void sortGems(int N, int[] arr) {
        // Write your clever swapping magic here
        int st = 0 , mid = 0 , end = N-1;
        while(mid<=end){
            if(arr[mid]==0){
                swap(st,mid,arr);
                st++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(end,mid,arr);
                end--;
            }
        }
    }

    public static void swap(int st , int end , int[] arr){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sortGems(N, A);

        // Printing the sorted vault
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}