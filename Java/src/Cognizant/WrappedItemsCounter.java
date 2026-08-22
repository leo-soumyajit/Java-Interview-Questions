package Cognizant;

/**
 * 📝 Problem: Wrapped Items Counter
 *
 * Problem Statement:
 * You are given a string S consisting of lowercase English letters and digits,
 * where the letters represent items and the digits represent packaging lines.
 * You have to count how many items are wrapped by packaging lines, i.e., how
 * many letters have a digit on the left and a digit on the right in the string.
 *
 * Your task is to find and return an integer value representing the number of
 * items wrapped in packaging lines.
 *
 * Input Specification:
 * input1 : A string S containing only lowercase English letters and digits (0-9).
 *
 * Output Specification:
 * Return an integer value representing the number of items wrapped in
 * packaging lines.
 *
 * Example 1:
 * input1 : 1a2b3c4d5
 * Output : 4
 *
 * Explanation:
 * Here, the string S is "1a2b3c4d5". We can find the wrapped items as below:
 * - 'a' between 1 and 2
 * - 'b' between 2 and 3
 * - 'c' between 3 and 4
 * - 'd' between 4 and 5
 * The count of such items is 4, hence 4 is returned as the output.
 *
 * Example 2:
 * input1 : 5aart6i7io8o5o56
 * Output : 3
 *
 * Explanation:
 * Here, the string S is "5aart6i7io8o5o56". We can find the wrapped items as below:
 * - 'i' between 6 and 7
 * - 'o' between 8 and 5
 * - 'o' between 5 and 5
 * The count of such items is 3, hence 3 is returned as the output.
 */
public class WrappedItemsCounter {

    public static int countWrappedItems(String s) {
        int count = 0;

        char[] arr = s.toCharArray();

        for (int i = 0 ; i < arr.length ; i++) {
            boolean isLeft = false;
            boolean isRight = false;

            // Check if the current character is a letter
            if (Character.isLetter(arr[i])) {

                // Check left neighbor
                if (i > 0 && Character.isDigit(arr[i-1])) {
                    isLeft = true;
                }

                // Check right neighbor
                if (i < arr.length - 1 && Character.isDigit(arr[i+1])) {
                    isRight = true;
                }

                // If both sides are digits, increment count
                if (isLeft && isRight) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String input1_1 = "1a2b3c4d5";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1_1);
        System.out.println("Output: " + countWrappedItems(input1_1));
        // Expected Output: 4

        // Test Case 2 (From Image)
        String input1_2 = "5aart6i7io8o5o56";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input1_2);
        System.out.println("Output: " + countWrappedItems(input1_2));
        // Expected Output: 3
    }
}