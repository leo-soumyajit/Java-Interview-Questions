package StoryBased;

import java.util.*;

public class TheGoblinsVault {

    public static int calculateFinalBalance(int N, int[] arr) {
        // Write your clever cumulative tracking magic here
        int sum = 0;
        for(int i = 0 ; i< arr.length ; i++){
            sum += arr[i];
            if(sum < 0){
                sum -= 5;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] transactions = new int[N];
        for (int i = 0; i < N; i++) {
            transactions[i] = sc.nextInt();
        }

        System.out.println(calculateFinalBalance(N, transactions));
        sc.close();
    }
}