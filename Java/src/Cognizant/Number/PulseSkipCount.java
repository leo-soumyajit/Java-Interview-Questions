package Cognizant.Number;

import java.util.Stack;

/**
 * 📝 Problem: Pulse Skip Count
 *
 * Problem Statement:
 * Process data packets using a stack.
 * For each element A[i], remove elements from the stack that are smaller OR EQUAL to A[i].
 * Count the number of removed elements (pulse skip count).
 * Push A[i] to the stack.
 * Return the total sum of all skip counts.
 */
public class PulseSkipCount {

    public static int getTotalSkipCount(int N, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int totalSkipCount = 0;

        for (int i = 0 ; i < arr.length ; i++) {

            // Asol Rule: Jotokhon stack faka noy AND notun packet-ta
            // stack-er top-er theke boro ba soman (>=)
            while (!stack.empty() && arr[i] >= stack.peek()) {
                stack.pop();         // Choto/soman ke ber kor
                totalSkipCount++;    // Skip count bariye ne
            }

            // Sob choto der taranor por nijeke dhukiye ne
            stack.push(arr[i]);
        }

        return totalSkipCount;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        int N = 6;
        int[] A = {3, 1, 4, 2, 5, 1};

        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + getTotalSkipCount(N, A));
        // Expected Output: 4
    }
}