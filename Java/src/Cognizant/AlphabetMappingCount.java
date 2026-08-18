package Cognizant;

/**
 * 📝 Problem: Count Valid Alphabet Mappings
 *
 * Problem Statement:
 * You are given a numeric string S consisting of digits from '1' to '9'.
 * Each number can be mapped to a letter in the alphabet ('1' -> A, '2' -> B, ..., '26' -> Z).
 * You can extract single digits or valid consecutive two-digit combinations (<= 26).
 *
 * Your task is to find and return an integer value representing the count of unique
 * alphabetic mappings possible from the given string S.
 *
 * Input Specification:
 * input1 : A string S representing the digits.
 *
 * Output Specification:
 * Return an integer value representing the total count of valid single and double digit mappings.
 *
 * Example 1:
 * input1: "226"
 * Output: 5
 * Explanation: Single digits (2, 2, 6) = 3 valid. Double digits (22, 26) = 2 valid. Total = 5.
 *
 * Example 2:
 * input1: "11292"
 * Output: 7
 * Explanation: Single digits (1, 1, 2, 9, 2) = 5 valid. Double digits (11, 12) = 2 valid. Total = 7.
 */
public class AlphabetMappingCount {

    public static int countValidMappings(String s) {

        // Step 1: Since string only has '1' to '9', all single digits are valid mappings.
        // Therefore, we initialize the count directly with the string's length.
        int count = s.length();

        // Step 2: Loop to extract consecutive pairs (stopping at length - 1 to avoid OutOfBounds)
        for (int i = 0; i < s.length() - 1; i++) {

            // Step 3: Extract the 2-digit substring
            String pair = s.substring(i, i + 2);

            // Step 4: Convert the extracted string to an integer
            int num = Integer.parseInt(pair);

            // Step 5: If the 2-digit number is 26 or less, it's a valid alphabet mapping
            if (num <= 26) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test Case 1
        String input1 = "226";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + countValidMappings(input1));
        // Expected Output: 5

        // Test Case 2
        String input2 = "11292";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + countValidMappings(input2));
        // Expected Output: 7
    }
}