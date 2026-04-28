package StoryBased;

import java.util.*;

public class TheAlchemistsNumbness {

    public static int calculateTotalHealth(int N, int[] arr) {
        // Write your clever countdown-tracking magic here
//        6
//        5 10 -3 4 6 8

        int reset = 0;
        int sum = 0;
        for(int i = 0 ; i<N ; i++){

            if(arr[i]>0 && reset==0){
                sum+=arr[i];
            }
            else if(arr[i]<0){
                reset = 2;
            }else{
                reset--;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] potions = new int[N];
        for (int i = 0; i < N; i++) {
            potions[i] = sc.nextInt();
        }

        System.out.println(calculateTotalHealth(N, potions));
        sc.close();
    }
}