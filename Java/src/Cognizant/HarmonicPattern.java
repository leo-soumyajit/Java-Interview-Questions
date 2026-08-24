package Cognizant;

/**
 * 📝 Problem: Largest Harmonic Pattern Substring
 *
 * Problem Statement:
 * A harmonic pattern in a string is a pattern where the string starts with
 * 'ab' and repeats itself with one additional alphabet in alphabetical order.
 * The moment this pattern breaks, the string is no longer in harmonic pattern.
 * You are given a string S, and you have to find and return an integer value
 * representing the largest contiguous substring which is in harmonic pattern.
 *
 * Input Specification:
 * input1 : A string value S
 *
 * Output Specification:
 * Return an integer value representing the largest contiguous substring
 * which is in harmonic pattern.
 *
 * Example 1:
 * input1 : ababcabc
 * Output : 5
 *
 * Explanation:
 * Here, the string S is "ababcabc". We can break the string into following:
 * - 1st pattern block needed: "ab" -> matches! (Length = 2)
 * - 2nd pattern block needed: "abc" -> matches! (Length = 2 + 3 = 5)
 * - 3rd pattern block needed: "abcd" -> string only has "abc" left, pattern breaks!
 * The maximum valid contiguous harmonic substring found is "ababc", length is 5.
 */


/**
 * 📝 Problem: Largest Harmonic Pattern Substring
 */
public class HarmonicPattern {

    public static int findLargestHarmonicSubstring(String s) {

        int maxLen = 0;

        // Pura string-er upor loop chalabo, proti index theke check korbo
        for (int i = 0; i < s.length(); i++) {

            int currIndex = i;         // Ekhon kon index theke check korchi
            int currentLen = 0;        // Ei index theke pattern match hole length koto hobe
            String target = "ab";      // Amader prothom target block
            char nextChar = 'c';       // Erporer character ki add hobe target-e

            // Loop cholbe jotokhon s.startsWith() amader target ta khunje pabe
            // currIndex <= s.length() - target.length() deya hoyeche jate Array Out of Bounds na hoy
            while (currIndex <= s.length() - target.length() && s.startsWith(target, currIndex)) {

                // Match kore geche! Tai length bariye dilam
                currentLen += target.length();

                // Index take samne egiye dilam porer target ta khojar jonno
                currIndex += target.length();

                // Notun target toiri korlam (jemon "ab" + 'c' = "abc")
                target += nextChar;

                // Next character take bariye dilam ('c' theke 'd' hoye gelo)
                nextChar++;
            }

            // Ekta loop shesh hole (mane pattern bhenge gele) maxLen update korlam
            maxLen = Math.max(maxLen, currentLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String input1_1 = "ababcabc";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1_1);
        System.out.println("Output: " + findLargestHarmonicSubstring(input1_1));
        // Expected Output: 5

        // Test Case 2 (Custom Test Case)
        String input1_2 = "xyzababcabcdpq";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input1_2);
        System.out.println("Output: " + findLargestHarmonicSubstring(input1_2));
        // Expected Output: 9 ("ab" + "abc" + "abcd" = 2 + 3 + 4 = 9)
    }
}