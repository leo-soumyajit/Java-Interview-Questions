package Cognizant;

import java.util.*;

/**
 * 📝 Problem: Fruit Frequency Difference
 *
 * Problem Statement:
 * You are given a string S containing fruits, where each character represents a fruit type.
 * Your task is to find and return an integer value representing the largest absolute
 * difference between the count of the fruit with the maximum odd frequency and the
 * count of the fruit with the minimum even frequency.
 *
 * Note:
 * - Fruits contain at least one character with an odd frequency and one with an even frequency.
 *
 * Input Specification:
 * input1 : A string S, representing different types of fruits.
 *
 * Output Specification:
 * Return an integer representing the absolute difference between the count of the fruit
 * with the maximum odd frequency and the count of the fruit with the minimum even frequency.
 *
 * Example 1:
 * input1: "aartfu"
 * Output: 1
 * Explanation:
 * Frequencies: a=2 (even), r=1, t=1, f=1, u=1 (all odd).
 * Max odd frequency = 1. Min even frequency = 2.
 * Absolute difference = |1 - 2| = 1.
 */
public class FruitFrequency {

    public static int findFrequencyDifference(String s) {

        // Step 1: Character frequency count korar jonno Map
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: maxOdd ar minEven initialize kora
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        // Step 3: Map-er keySet dhore loop chaliye max/min ber kora
        for (char fruit : map.keySet()) {
            int freq = map.get(fruit);

            if (freq % 2 != 0) {
                // freq odd hole maxOdd update
                maxOdd = Math.max(maxOdd, freq);
            } else {
                // freq even hole minEven update
                minEven = Math.min(minEven, freq);
            }
        }

        // Step 4: Absolute difference return kora
        return Math.abs(maxOdd - minEven);
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String input1 = "aartfu";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + findFrequencyDifference(input1));
        // Expected Output: 1

        // Test Case 2 (Custom)
        String input2 = "aaaaabbc";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + findFrequencyDifference(input2));
        // Expected Output: 3
    }
}