package Cognizant;

/**
 * 📝 Problem: Perfect Square Character Replacement
 *
 * Problem Statement:
 * You are given a lowercase string S. For each character, you have to find its
 * position in the alphabet (a = 1, b = 2, ..., z = 26) by following below rules:
 *
 * - If the position is a perfect square, let K = √position.
 * - If either neighbor (left or right) has position K, you will leave the
 *   character unchanged.
 * - Otherwise, replace it with the letter at position K.
 * - If the position is not a perfect square, you should leave the character
 *   unchanged.
 *
 * Your task is to modify and return the final string.
 *
 * Input Specification:
 * input1 : A string of lowercase English letters (a-z).
 *
 * Output Specification:
 * Return the final modified string by following the rules mentioned above.
 *
 * Example 1:
 * input1 : abcd
 * Output : abcb
 *
 * Explanation:
 * Here, the S is "abcd". We can see that:
 * - 'a' = 1 -> perfect square (but √1 = 1, hence no change)
 * - 'b' = 2 -> not square. So, this will remain unchanged.
 * - 'c' = 3 -> not square. So, this will remain unchanged.
 * - 'd' = 4 -> square -> √4 = 2. The letter at position 2 is 'b'. 'b' is not
 *   present on the left of 'd' (its left neighbor is 'c'), so it will be
 *   replaced with 'b'.
 * Hence, "abcb" is returned as output.
 */
public class PerfectSquareCharReplace {

    public static String replaceChars(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            // Position ber kora (e.g., 'a' = 1, 'b' = 2)
            int pos = arr[i] - 'a' + 1;

            // Square root kora (K)
            int k = (int) Math.sqrt(pos);

            // Check jodi perfect square hoy
            if (k * k == pos) {

                boolean neighbourK = false;

                // Left neighbor check
                if (i > 0) {
                    int leftPos = arr[i - 1] - 'a' + 1;
                    if (leftPos == k) {
                        neighbourK = true;
                    }
                }

                // Right neighbor check
                if (i < arr.length - 1) {
                    int rightPos = arr[i + 1] - 'a' + 1;
                    if (rightPos == k) {
                        neighbourK = true;
                    }
                }

                // Neighbor match na korle char replace kora
                if (!neighbourK) {
                    arr[i] = (char) ('a' + k - 1);
                }
            }
        }

        // Modified array take abar String-e convert kore return kora
        return new String(arr);
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String input1 = "abcd";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + replaceChars(input1));
        // Expected Output: abcb

        // Test Case 2 (Custom: Neighbors match K)
        String input2 = "abd"; // 'd' is 4, √4 = 2 ('b'). Left neighbor is 'b' (position 2 = K). So 'd' remains unchanged.
        System.out.println("\n--- Test Case 2 (Neighbor matches) ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + replaceChars(input2));
        // Expected Output: abd
    }
}