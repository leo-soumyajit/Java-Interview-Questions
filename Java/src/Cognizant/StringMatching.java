package Cognizant;

public class StringMatching {

    public static int findSubstringIndex(String text, String pattern) {
//        // That's it. This single line does exactly what the problem asks!
//        return text.indexOf(pattern);
        int textL = text.length();
        int patternL = pattern.length();

        //edge case
        if(patternL>textL)return -1;

        for(int i = 0 ; i<=textL-patternL ; i++){
            String part = text.substring(i,i+patternL);
            if(part.equals(pattern)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text1 = "cognizant";
        String pattern1 = "zan";

        String text2 = "ulmind";
        String pattern2 = "tech";

        String text3 = "hello";
        String pattern3 = "ll";

        String text4 = "cognizant";
        String pattern4 = "ant";

        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + findSubstringIndex(text1, pattern1));
        // Expected: 5

        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + findSubstringIndex(text2, pattern2));
        // Expected: -1

        System.out.println("\n--- Test Case 3 ---");
        System.out.println("Output: " + findSubstringIndex(text3, pattern3));
        // Expected: 2

        System.out.println("\n--- Test Case 4 (Edge Case) ---");
        System.out.println("Output: " + findSubstringIndex(text4, pattern4));
        // Expected: 6
    }
}

//📝 Problem 2: String Matching (Find Substring Index)
//Problem Statement:
//Given two strings, text and pattern, write a program to find the starting index of the first occurrence of pattern in text. If the pattern is not found in the text, return -1. You are not allowed to use any external libraries, but you may use standard built-in String methods if applicable.
//
//Sample Test Cases:
//
//Test Case 1:
//
//Input: text = "cognizant", pattern = "zan"
//
//Output: 5
//
//        (Explanation: The substring "zan" begins at index 5 of the string "cognizant".)
//
//Test Case 2:
//
//Input: text = "ulmind", pattern = "tech"
//
//Output: -1
//
//        (Explanation: The substring "tech" is not present in "ulmind", so the output is -1.)
//
//Test Case 3:
//
//Input: text = "hello", pattern = "ll"
//
//Output: 2