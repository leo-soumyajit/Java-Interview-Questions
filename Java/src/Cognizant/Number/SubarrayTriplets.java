package Cognizant.Number;

/**
 * 📝 Problem: Subarray Sum Triplets
 *
 * Problem Statement:
 * You are given an array of integers containing N elements. Your task is to find and return
 * an integer value representing the total number of subarrays of size 3 such that the sum
 * of the first element and the third element is equal to the second element.
 *
 * Input Specification:
 * input1 : An integer array of size N.
 * input2 : An integer value N, representing the size of array.
 *
 * Output Specification:
 * Return an integer value representing the total number of such subarrays.
 *
 * Example 1:
 * input1 : {1, 2, 1, 3, 5, 2, 4, 2}
 * input2 : 8
 * Output : 3
 */
public class SubarrayTriplets {

    public static int countTriplets(int[] arr, int input2) {
        int count = 0;

        // Tor logic ekhane likh...
        // Ekta for loop chala.
        // Koto dur obdi chalabi? Vab dekhin! (Hint: i < input2 - 2)
        // Bhetore if condition diye check kor: (input1[i] + input1[i+2] == input1[i+1])
        for (int i = 0 ; i<input2-2 ; i++){
            if(arr[i]+arr[i+2]==arr[i+1])count++;
        }

        return count;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        int[] input1 = {1, 2, 1, 3, 5, 2, 4, 2};
        int input2 = 8;

        System.out.println("--- Test Case 1 ---");
        System.out.println("Input Array: " + java.util.Arrays.toString(input1));
        System.out.println("Output: " + countTriplets(input1, input2));
        // Expected Output: 3
    }
}