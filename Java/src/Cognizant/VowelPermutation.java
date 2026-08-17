package Cognizant;

// Question: Vowel Permutation
// You are given a string S and your task is to find and return the count of permutations
// formed by fixing the positions of the vowels present in the string.
//
// Note:
// - Ensure the result is non-negative.
// - If there are no consonants then Return 0.
//
// Input Specification:
// input1 : A string S
//
// Output Specification:
// Return an integer value representing the count of permutations formed by fixing
// positions of the vowels present in the string.
//
// Example 1:
// input1 : ABC
// Output : 2
// Explanation: Here, in the given string "ABC" there is 1 vowel ('A') and by fixing its position there are
// 2 permutable letters ('B','C'). So, its permutation is 2! = 2. Therefore, 2 is returned as the output.
//
// Example 2:
// input1 : CDF
// Output : 6
// Explanation: Here, in the given string "CDF" there is no vowel and there are 3 permutable letters
// ('C','D','F'). So, its permutation is 3! = 6. Therefore, 6 is returned as the output.

public class VowelPermutation {
    public static int solve(String s) {
        char[] arr = s.replaceAll("[aeiouAEIOU]", "").toCharArray();
        int conso = arr.length;
        if (conso == 0) return 0;
        int fact = 1;
        for (int i = 2; i <= conso; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Input: ABC -> Output: " + solve("ABC")); // Expected: 2

        // Test Case 2
        System.out.println("Input: CDF -> Output: " + solve("CDF")); // Expected: 6

        // Test Case 3 (Edge case with no consonants)
        System.out.println("Input: AEIOU -> Output: " + solve("AEIOU")); // Expected: 0

        // Test Case 4 (Mix case)
        System.out.println("Input: aBcDe -> Output: " + solve("aBcDe")); // Expected: 6
    }
}