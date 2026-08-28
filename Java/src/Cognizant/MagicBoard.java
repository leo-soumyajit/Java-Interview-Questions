package Cognizant;

/**
 * 📝 Problem: Ritik's Magic Board
 *
 * Problem Statement:
 * Ritik wants a magic board, which displays a character for a corresponding
 * number for his science project. Help him to develop such an application.
 * For example when the digits 65, 66, 67, 68 are entered, the alphabet
 * ABCD are to be displayed. Assume the number of inputs should be always 4.
 *
 * Input Specification:
 * An array of 4 integers.
 *
 * Output Specification:
 * A single string containing the corresponding ASCII characters.
 *
 * Example 1:
 * Input: 65, 66, 67, 68
 * Output: ABCD
 */
public class MagicBoard {

    public static String getMagicCharacters(int[] digits) {

        StringBuilder result = new StringBuilder();

        // Tor logic ekhane likh...
        // 1. Array-tar upor ekta for loop chala
        // 2. Proti number ke character-e convert kor: (char) digits[i]
        // 3. result-e append kor

        for (int i = 0 ; i<digits.length ; i++){
            result.append((char)digits[i]);
        }



        return result.toString();
    }

    public static void main(String[] args) {
        // Test Case 1 (From Question)
        int[] input1 = {65, 66, 67, 68};
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: 65, 66, 67, 68");
        System.out.println("Output: " + getMagicCharacters(input1));
        // Expected Output: ABCD

        // Test Case 2 (Custom Test Case - Small letters)
        int[] input2 = {112, 97, 115, 115};
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: 112, 97, 115, 115");
        System.out.println("Output: " + getMagicCharacters(input2));
        // Expected Output: pass
    }
}