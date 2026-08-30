package Cognizant.Number;

/**
 * 📝 Problem: Dopamine Level Game
 *
 * Problem Statement:
 * John evaluates numbers in an array. If a number is within range [L, R] (inclusive),
 * his dopamine level increases by 1. Otherwise, it decreases by 1.
 * He starts with dopamine level 0. Return a string with the maximum and minimum
 * dopamine levels reached, separated by a space.
 *
 * Input Specification:
 * input1 : N (number of elements)
 * input2 : L (range start)
 * input3 : R (range end)
 * input4 : Integer array A
 *
 * Output Specification:
 * Return "MAX MIN".
 */
public class DopamineLevel {

    public static String findDopamineLevels(int N, int L, int R, int[] arr) {
        int current = 0;
        int max = 0;
        int min = 0;

        // Tor logic ekhane likh...
        // 1. Array (input4) er upor ekta loop chala
        // 2. Check kor input4[i] >= input2 AND input4[i] <= input3 kina
        // 3. Jodi hoy, current++ kor. Na hole current-- kor.
        // 4. Protibar current change howar por, max ar min take update korbi.
        for (int i = 0 ; i<N ; i++){
            if(arr[i]>=L && arr[i]<=R)current++;
            else current--;

            max = Math.max(max,current);
            min = Math.min(min,current);
        }


        return max + " " + min;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        int input1_1 = 4;
        int input2_1 = 1;
        int input3_1 = 3;
        int[] input4_1 = {4, 3, 2, 1};
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + findDopamineLevels(input1_1, input2_1, input3_1, input4_1));
        // Expected Output: "2 -1"

        // Test Case 2 (From Image)
        int input1_2 = 3;
        int input2_2 = 1;
        int input3_2 = 4;
        int[] input4_2 = {9, 3, 5};
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + findDopamineLevels(input1_2, input2_2, input3_2, input4_2));
        // Expected Output: "0 -1"
    }
}