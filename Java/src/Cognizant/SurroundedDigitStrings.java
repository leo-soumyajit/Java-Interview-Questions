package Cognizant;

/**
 * 📝 Problem: Surrounded Digit Strings
 *
 * Problem Statement:
 * You are given a string S containing lowercase letters (a-z) and digits (0-9).
 * You have to count how many digit substrings are surrounded by letters on both sides.
 * A digit substring is a sequence of one or more consecutive digits.
 *
 * Example:
 * input: "a123d" -> Output: 1 ("123" is surrounded by 'a' and 'd')
 * input: "12a34b56" -> Output: 1 (Only "34" is surrounded. "12" and "56" are not).
 */
public class SurroundedDigitStrings {

    public static int countValidSubstrings(String s) {
        int count = 0;

        for (int i = 0 ; i<s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){

                boolean leftValid = false;
                if(i>0 && Character.isLetter(s.charAt(i-1))){
                    leftValid=true;
                }

                while(i<s.length()&&Character.isDigit(s.charAt(i))){
                    i++;
                }

                boolean rightValid = false;
                if(i<s.length() && Character.isLetter(s.charAt(i))){
                    rightValid = true;
                }

                if(leftValid && rightValid)count++;

                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test Case 1
        String input1 = "a123d";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + countValidSubstrings(input1));
        // Expected Output: 1

        // Test Case 2 (Custom Edge Case)
        String input2 = "12a34b56";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + countValidSubstrings(input2));
        // Expected Output: 1

        // Test Case 3 (Custom Multiple)
        String input3 = "a1b22c";
        System.out.println("\n--- Test Case 3 ---");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + countValidSubstrings(input3));
        // Expected Output: 2
    }
}