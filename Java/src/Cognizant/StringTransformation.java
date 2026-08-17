package Cognizant;

public class StringTransformation {

    public static int findMinimumCost(String s1, String s2) {

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0 ; i<s1.length() ; i++){
            freq1[s1.charAt(i)-'A']++;
        }

        for(int i = 0 ; i<s2.length() ; i++){
            freq2[s2.charAt(i)-'A']++;
        }
        int totalCost = 0;

        for (int i = 0 ;i<26;i++){
            if(freq2[i]>freq1[i]){
                totalCost += (freq2[i]-freq1[i]);
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + findMinimumCost("ABD", "AABCCAD")); // Expected: 4

        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + findMinimumCost("ABC", "XYZ")); // Expected: 3
    }
}

//📝 Problem 4: String Transformation (Minimum Cost)
//Problem Statement:
//You are provided with two strings, S1 and S2 consisting of uppercase alphabets only. You can perform adding, removing, or swapping letters on S1 to convert it to S2.
//
//Removing a letter: Cost is 0.
//
//Swapping letters: Cost is 0.
//
//Adding a new letter to the end: Cost is 1.
//
//Find and return the minimum cost required to transform S1 into S2.
//
//Sample Test Cases:
//
//Test Case 1:
//
//Input: S1 = "ABD", S2 = "AABCCAD"
//
//Output: 4
//
//Test Case 2:
//
//Input: S1 = "ABC", S2 = "XYZ"
//
//Output: 3