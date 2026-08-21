package Cognizant;

import java.util.HashSet;

/**
 * 📝 Problem: Distinct Barking Patterns
 *
 * Problem Statement:
 * You are monitoring a group of dogs barking on the street. Each dog can bark a
 * certain number of times in succession, and the bark patterns are represented in
 * a string. Given a string S, where:
 * - A dog that barks once is represented as B.
 * - A dog that barks twice in succession is represented as BB.
 * - A dog that barks three times in succession is represented as BBB, and so on.
 * - Silence is represented by a "."
 *
 * Your task is to find and return an integer value representing how many distinct
 * types of dogs are present based on their barking patterns.
 *
 * Input Specification:
 * input1 : A string S representing the barking patterns of the dogs.
 *
 * Output Specification:
 * Return an integer value representing the number of distinct types of dogs
 * present based on their barking patterns.
 *
 * Example 1:
 * input1 : B...B...BB...B....BBB
 * Output : 3
 *
 * Explanation:
 * Here, the string S is "B...B...BB...B....BBB". The distinct types of dogs
 * based on barking patterns are:
 * - B (single bark)
 * - BB (double bark)
 * - BBB (triple bark)
 * Total distinct types = 3.
 */
public class DistinctDogBarks {

    public static int countDistinctDogs(String input1) {

        // Step 1: String take '.' diye kete tukro kora
        String[] arr = input1.split("\\.+");

        // Step 2: Unique value rakhar jonno HashSet toiri kora
        HashSet<String> hs = new HashSet<>();

        // Step 3: Loop chaliye check kora
        for (int i = 0 ; i < arr.length ; i++){
            // String fanka na hole tobei Set e dhokabo (To avoid empty strings at start/end)
            if(!arr[i].isEmpty()){
                hs.add(arr[i]);
            }
        }

        // Step 4: Joto gulo unique value set e aache setai output
        return hs.size();
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String input1 = "B...B...BB...B....BBB";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + countDistinctDogs(input1));
        // Expected Output: 3

        // Test Case 2 (Custom Test Case)
        String input2 = "BB.B.BBB.BB.BB.B";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + countDistinctDogs(input2));
        // Expected Output: 3 (B, BB, BBB)

        // Test Case 3 (Custom Test Case - Edge Case empty dots)
        String input3 = "....";
        System.out.println("\n--- Test Case 3 ---");
        System.out.println("Input: " + input3);
        System.out.println("Output: " + countDistinctDogs(input3));
        // Expected Output: 0
    }
}