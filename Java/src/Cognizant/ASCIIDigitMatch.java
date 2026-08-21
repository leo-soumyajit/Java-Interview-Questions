package Cognizant;

/**
 * 📝 Problem: ASCII Digit Matcher
 *
 * Problem Statement:
 * You are given a string S containing only uppercase English letters, and an
 * integer array A of size N. You have to follow the below steps:
 * - For each character in the string, get its ASCII value.
 * - Check if any digit from this ASCII value exists in array A.
 * - If yes, count that character.
 *
 * Your task is to find and return an integer value representing the count of
 * characters in the string that have at least one digit from their ASCII value
 * present in array A.
 *
 * Input Specification:
 * input1 : An integer value N, representing the size of the array.
 * input2 : An integer array A.
 * input3 : A string S.
 *
 * Output Specification:
 * Return an integer value representing the number of characters in the string
 * whose ASCII value contains at least one digit present in the given array A.
 *
 * Example 1:
 * input1 : 6
 * input2 : {1, 6, 4, 3, 6, 5}
 * input3 : "ABCDEF"
 * Output : 5
 *
 * Explanation:
 * Here, the array is {1,6,4,3,6,5} and the string S is "ABCDEF".
 * Below are the ASCII values:
 * - A = 65 -> digits = [6,5] (6 and 5 are in array) -> Match
 * - B = 66 -> digits = [6,6] (6 is in array) -> Match
 * - C = 67 -> digits = [6,7] (6 is in array) -> Match
 * - D = 68 -> digits = [6,8] (6 is in array) -> Match
 * - E = 69 -> digits = [6,9] (6 is in array) -> Match
 * - F = 70 -> digits = [7,0] (Neither 7 nor 0 is in array) -> No Match
 * Total count = 5.
 */
public class ASCIIDigitMatch {

    public static int countMatchingChars(int n, int[] arr, String s) {

        int count = 0;

        // Step 1: String-er protita okkhorer upor loop
        for (int i = 0; i < s.length(); i++) {

            // Okkhor theke direct ASCII value nilam
            int no = s.charAt(i);
            int temp = no;

            boolean isMatched = false;

            // Step 2: ASCII value take bhenge digit ber kora
            while (temp != 0) {
                int digit = temp % 10;

                // Step 3: Digit-ta array-te aache kina check kora
                for (int j = 0; j < arr.length; j++) {
                    if (digit == arr[j]) {
                        isMatched = true;
                        break; // Match peye gechi, array khnujar loop theke beriye elam
                    }
                }

                // Match peye gele ashol count bariye while loop thekeo beriye asbo
                if (isMatched) {
                    count++;
                    break;
                }

                // Last digit kete urie dilam
                temp /= 10;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        int input1_1 = 6;
        int[] input2_1 = {1, 6, 4, 3, 6, 5};
        String input3_1 = "ABCDEF";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + countMatchingChars(input1_1, input2_1, input3_1));
        // Expected Output: 5

        // Test Case 2 (Custom: No digits match)
        int input1_2 = 3;
        int[] input2_2 = {1, 2, 3};
        String input3_2 = "XYZ"; // X=88, Y=89, Z=90
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + countMatchingChars(input1_2, input2_2, input3_2));
        // Expected Output: 0

        // Test Case 3 (Custom: All digits match)
        int input1_3 = 2;
        int[] input2_3 = {8, 9};
        String input3_3 = "XY"; // X=88, Y=89
        System.out.println("\n--- Test Case 3 ---");
        System.out.println("Output: " + countMatchingChars(input1_3, input2_3, input3_3));
        // Expected Output: 2
    }
}