package Cognizant;

/**
 * 📝 Problem: Count elements of string
 *
 * Problem Statement:
 * Write a program to count the number of digits, special characters, whitespaces, and
 * alphabets in a string. Print the count of each in the same order, one per line.
 *
 * Input Specification:
 * first line takes the input of a sentence
 *
 * Output Specification:
 * Print the count of each element type:
 * Alphabets - [count]
 * Digits - [count]
 * Space - [count]
 * Special Character - [count]
 *
 * Example 1:
 * Input : Amcatuff@ #% 123
 * Output :
 * Alphabets - 8
 * Digits - 3
 * Space - 2
 * Special Character - 3
 */
public class StringElementCounter {

    public static void countElements(String s) {

        int alphaCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int specialCount = 0;

        // Tor logic ekhane likh...
        // Pura string-er upor loop chala ar if-else-if diye check kor
        for (int i = 0 ; i<s.length() ; i++){
            if(Character.isDigit(s.charAt(i)))digitCount++;
            else if(Character.isLetter(s.charAt(i)))alphaCount++;
            else if(Character.isSpaceChar(s.charAt(i)))spaceCount++;
            else specialCount++;
        }

        // Output format ekdam milie print korbi
        System.out.println("Alphabets - " + alphaCount);
        System.out.println("Digits - " + digitCount);
        System.out.println("Space - " + spaceCount);
        System.out.println("Special Character - " + specialCount);
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image/Question)
        String input1 = "Amcatuff@ #% 123";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output:");
        countElements(input1);

        // Expected Output:
        // Alphabets - 8
        // Digits - 3
        // Space - 2
        // Special Character - 3
    }
}