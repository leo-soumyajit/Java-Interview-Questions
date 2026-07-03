package StoryBased;

import java.util.*;

public class TheSmugglersCargo {
    
    public static long calculateTotalProfit(int N, int[] arr) {
        // Write your clever conditional two-pointer magic here

        int profit = 0;
        int st = 0 , end = N-1;
        while(st<end){
            int check = arr[st]+arr[end];
            if( check % 2 == 0){
               profit += arr[st]*arr[end];
               st++;
               end--;
            }
            else{
                if(arr[st]<arr[end]){
                    st++;
                }else{
                    end--;
                }

            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cargo = new int[N];
        for (int i = 0; i < N; i++) {
            cargo[i] = sc.nextInt();
        }
        
        System.out.println(calculateTotalProfit(N, cargo));
        sc.close();
    }
}

//5
//2 4 3 5 6

//4
//        10 2 5 10