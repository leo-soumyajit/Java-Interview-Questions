package StoryBased;

import java.util.*;

public class TheForgemastersCombo {

    public static int calculateFinalScore(int N, int[] arr) {
        // Write your clever combo-tracking magic here
        int comboMultiplier = 1;
        int totalScore = 0;

        for (int i = 0 ; i <arr.length ; i++){
            if(arr[i]>0){
                totalScore += (comboMultiplier * arr[i]);
                if(comboMultiplier<3){
                    comboMultiplier++;
                }   
            }
            else if(arr[i]<0){
                totalScore += arr[i];
                comboMultiplier = 1;
            }
        }

        return totalScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ores = new int[N];
        for (int i = 0; i < N; i++) {
            ores[i] = sc.nextInt();
        }

        System.out.println(calculateFinalScore(N, ores));
        sc.close();
    }
}