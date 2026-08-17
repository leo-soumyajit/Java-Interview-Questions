package Cognizant;

public class MaxPermutationString {

    public static int findMaxPermutation(String[] input1, int N) {
        int maxConsonants = 0;
        for (int i = 0; i < N; i++) {
            int count = input1[i].replaceAll("[aeiouAEIOU]","").length();
            maxConsonants = Math.max(maxConsonants,count);
        }
        if (maxConsonants==0)return 0;
        return factorial(maxConsonants);
    }
    static int factorial(int n){
        int fact=1;
        for (int i = 2 ; i<=n ; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Test Case 1 (From the image)
        String[] test1 = {"eio"};
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + findMaxPermutation(test1, test1.length));
        // Expected Output: 0

        // Test Case 2 (Our custom test case)
        String[] test2 = {"hello", "world", "code"};
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + findMaxPermutation(test2, test2.length));
        // Expected Output: 24 (Karon 'world' e 4 te consonant, ar 4! = 24)
    }
}
/**
 * 📝 Problem: Maximum Permutation Value
 *
 * Problem Statement:
 * You are given a string array of length N. Your task is to find and return an integer value
 * representing the maximum permutation count of the strings after removing all the vowels
 * from every element in the string array.
 *
 * Note:
 * - Consider all the letters in the string as different (if the word is "doll", then consider both 'l's as different).
 * - If there are no permutable characters then return 0.
 * - The string consists of both uppercase and lowercase characters.
 *
 * Input Specification:
 * input1 : A string array of length N.
 * input2 : An integer N, representing the size of the string array.
 *
 * Output Specification:
 * Return an integer value representing the maximum permutation count of the string elements.
 *
 * Example 1:
 * input1: {"eio"}
 * input2: 1
 * Output: 0
 * Explanation: "eio" has only vowels. After removal, 0 characters left. Hence, 0.
 *
 * Example 2 (Custom):
 * input1: {"hello", "world", "code"}
 * input2: 3
 * Output: 24
 * Explanation: "world" has 4 consonants. 4! = 24.
 */