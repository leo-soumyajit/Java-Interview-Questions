package Cognizant.Number;

/**
 * 📝 Problem: Waive Off Smallest Unique Loan
 *
 * Problem Statement:
 * Find the smallest positive unique loan amount from an N*N 2D array.
 *
 * Input Specification:
 * input1 : An integer N (size of the array)
 * input2 : A 2D integer array L representing loan amounts
 *
 * Output Specification:
 * Return an integer representing the smallest positive unique loan amount.
 */

import java.util.HashMap;

public class LoanWaiver {

    // 2d array te hashmap diye freq er operation

    public static int waiveOffLoan(int N, int[][] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        //freq ber kore nilam
        for (int i = 0 ; i<arr.length; i++){
            for (int j = 0 ; j< arr.length; j++){
                int value = arr[i][j];

                map.put(value,map.getOrDefault(value,0)+1);
            }
        }
        //ekhane jei value ta unique and >0 seta return krbo but jdi tie hoy sob theke choto value ta return hobe
        int min = Integer.MAX_VALUE;

        for (int key : map.keySet()){
            int count = map.get(key);

            if(key>0 && count==1){
                min = Math.min(min,key);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Test Case 1
        int input1 = 3;
        int[][] input2 = {
                {-1, 1, 3},
                {2, 3, 4},
                {3, 4, 5}
        };

        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + waiveOffLoan(input1, input2));
        // Expected Output: 1
    }
}