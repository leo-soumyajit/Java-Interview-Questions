package StoryBased;

import java.util.*;

public class TheRhythmOfTheRunes {

    public static int longestAlternatingSequence(int N, int[] arr) {
        // Write your clever alternating logic here
        int count = 1;
        int max = 1;
        for(int i = 1 ; i<arr.length ; i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                count++;
                max = Math.max(count,max);
            }else{
                count = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] runes = new int[N];
        for (int i = 0; i < N; i++) {
            runes[i] = sc.nextInt();
        }

        System.out.println(longestAlternatingSequence(N, runes));
        sc.close();
    }
}