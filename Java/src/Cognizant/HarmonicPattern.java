package Cognizant;

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