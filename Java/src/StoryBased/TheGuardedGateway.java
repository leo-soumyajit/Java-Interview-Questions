package StoryBased;

import java.util.*;

public class TheGuardedGateway {

    public static boolean canOpenGate(int N, int Target, int[] arr) {
        // Write your code here (No HashMap allowed!)
        int st = 0 ;
        int end = N-1;
        while(st<end){
            if(arr[st]+arr[end]==Target){
                return true;
            }else if(arr[st]+arr[end]<Target){
                st++;
            }
            else{
                end--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Target = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(canOpenGate(N, Target, A));
        sc.close();
    }
}