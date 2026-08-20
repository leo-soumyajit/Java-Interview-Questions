package Cognizant;

/**
 * 📝 Problem: Balanced String Conversion
 *
 * Problem Statement:
 * Jacob has a string S containing only X and Y. A string is considered balanced
 * when X and Y are alternatively aligned (e.g., XYXYXY or YXYXYX). There should
 * not be multi-occurrences of X or Y (e.g., XXY or YYX are invalid).
 *
 * You can convert the string to a balanced string by interchanging X to Y or Y to X.
 * Find and return the minimum count of conversions required.
 *
 * Input Specification:
 * input1 : A string value S representing the paragraph.
 *
 * Output Specification:
 * Return an integer value representing the count of the minimum conversion required.
 *
 * Example 1:
 * input1: XXYYXXY
 * Output: 3
 * Explanation:
 * The target balanced string with minimum changes is "YXYXYXY".
 * 1st char X -> Y, 4th char Y -> X, 5th char X -> Y. Total 3 conversions.
 */
public class BalancedStringX_Y {

    public static int findMinConversions(String s) {

        // f_ops = changes needed to match Pattern 1 (XYXYXY...)
        int f_ops = 0;

        // l_ops = changes needed to match Pattern 2 (YXYXYX...)
        int l_ops = 0;

        for (int i = 0 ; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Even index positions (0, 2, 4...)
            if (i % 2 == 0) {
                // Pattern 1 expects 'X' here
                if (ch != 'X') {
                    f_ops++;
                } else {
                    // If it is 'X', it's a mismatch for Pattern 2 (which expects 'Y' here)
                    l_ops++;
                }
            }
            // Odd index positions (1, 3, 5...)
            else {
                // Pattern 1 expects 'Y' here
                if (ch != 'Y') {
                    f_ops++;
                } else {
                    // If it is 'Y', it's a mismatch for Pattern 2 (which expects 'X' here)
                    l_ops++;
                }
            }
        }

        // Return the minimum of the two possibilities
        return Math.min(f_ops, l_ops);
    }

    public static void main(String[] args) {
        // Test Case 1 (From Example)
        String input1 = "XXYYXXY";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + findMinConversions(input1));
        // Expected Output: 3

        // Test Case 2 (Custom: Already Balanced)
        String input2 = "XYXYX";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + findMinConversions(input2));
        // Expected Output: 0
    }
}