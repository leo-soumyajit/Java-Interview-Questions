package Cognizant.Number;

/**
 * 📝 Problem: Fair Array Splits
 *
 * Problem Statement:
 * Alice has an integer array A of length N. She wants to split the array into two non-empty
 * parts at some index i. The first part consists of elements from indices [0, i], and
 * the second part consists of elements from indices [i+1, N-1].
 * Alice considers a split to be "fair" if the absolute difference between the sum of the
 * two parts is an even number.
 *
 * Your task is to help Alice find and return an integer value representing the number of
 * fair splits possible in array A.
 *
 * Input Specification:
 * input1: An integer value N representing the size of the array.
 * input2: An integer array A representing the array Alice wants to split.
 *
 * Output Specification:
 * Return an integer value representing the number of fair splits possible in array A.
 *
 * Example 1:
 * input1 : 5
 * input2 : {10, 10, 3, 7, 6}
 * Output : 4
 *
 * Explanation:
 * Let's test all possible splits (i can be from 0 to 3):
 * 1. Split at i=0: Left={10} (sum=10), Right={10,3,7,6} (sum=26). Diff = |10-26| = 16 (Even -> Fair!)
 * 2. Split at i=1: Left={10,10} (sum=20), Right={3,7,6} (sum=16). Diff = |20-16| = 4 (Even -> Fair!)
 * 3. Split at i=2: Left={10,10,3} (sum=23), Right={7,6} (sum=13). Diff = |23-13| = 10 (Even -> Fair!)
 * 4. Split at i=3: Left={10,10,3,7} (sum=30), Right={6} (sum=6). Diff = |30-6| = 24 (Even -> Fair!)
 * Total fair splits = 4.
 */
public class FairSplits {

    public static int countFairSplits(int N, int[] arr) {
        int count = 0;
        int totalSum = 0;

        for (int i = 0 ; i<arr.length ; i++){
            totalSum += arr[i];
        }
        int left =0;
        for (int i = 0 ; i<arr.length-1 ; i++){

            left+=arr[i];
            int right = totalSum-left;
            int ans = Math.abs(right-left);
            if(ans%2==0)count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        int N1 = 5;
        int[] A1 = {10, 10, 3, 7, 6};
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: N=" + N1 + ", A=" + java.util.Arrays.toString(A1));
        System.out.println("Output: " + countFairSplits(N1, A1));
        // Expected Output: 4
    }
}