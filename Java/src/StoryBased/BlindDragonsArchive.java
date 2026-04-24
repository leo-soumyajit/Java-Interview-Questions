package StoryBased;

import java.util.*;

public class BlindDragonsArchive {

    public static int findSpellbook(int N, int Target, int[] A) {
        // Write your ultra-fast search logic here
        int st = 0 , end = N-1;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(A[mid]==Target){
                ans = mid;
                end = mid-1;
            } else if (A[mid]>Target) {
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans; // Return -1 if the book is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Target = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(findSpellbook(N, Target, A));
        sc.close();
    }
}