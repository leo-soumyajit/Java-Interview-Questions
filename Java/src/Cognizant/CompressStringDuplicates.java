package Cognizant;

/**
 * 📝 Problem: Compress String Duplicates
 *
 * Problem Statement:
 * You are given a string S in which you have to replace every group of two or more
 * consecutive identical characters with a single '#'. If multiple '#' characters
 * appear consecutively, replace them with a single '#' as well.
 *
 * Example:
 * input: "aabbbccdeeea" -> Output: "#d#a"
 */
public class CompressStringDuplicates {

    public static String compressString(String s) {

        StringBuilder res = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            int count = 1;

            // Samner okkhor same hole count bara ar i ke egiye ne
            while (i + 1 < n && s.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            // Loop theke beronor por check
            if (count == 1) {
                // 1 ta thakle direct boshiye de
                res.append(currentChar);
            } else {
                // 1 er beshi thakle '#' boshabo
                // Kintu age check korbo result-er last-e already '#' aache kina
                if (res.length() == 0 || res.charAt(res.length() - 1) != '#') {
                    res.append('#');
                }
            }

            //  Ekhane i-- LAGBE NA!
            // Karon while loop theke beronor por 'i' already block-er last okkhore dariye aache.
            // Main for-loop er i++ nije thekei ebar next notun okkhore chole jabe.
        }

        return res.toString();
    }

    public static void main(String[] args) {
        // Test Case 1
        String input1 = "aabbbccdeeea";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + compressString(input1));
        // Expected Output: #d#a

        // Test Case 2 (Custom: Starts and ends with duplicates)
        String input2 = "xxxyyzz";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + compressString(input2));
        // Expected Output: #
    }
}