package Cognizant;

/**
 * 📝 Problem: Homogeneous Layers Builder
 *
 * Problem Statement:
 * You are given a string S made of lowercase English letters. You have to build
 * layers from the string where:
 * - The 1st layer takes 1 character,
 * - The 2nd layer takes 2 characters,
 * - The 3rd layer takes 3 characters, and so on.
 *
 * You have to keep forming layers until there aren't enough characters left for
 * the next full layer. Each layer is built from left to right, using the string
 * characters in order. A layer is homogeneous if all characters in that layer
 * are the same.
 *
 * Your task is to find and return an integer value representing the number of
 * homogeneous layers formed.
 *
 * Input Specification:
 * input1 : A single string value S.
 *
 * Output Specification:
 * Return an integer value representing the number of homogeneous layers formed.
 *
 * Example 1:
 * input1 : aaabbbcccdddddd
 * Output : 4
 *
 * Explanation:
 * Here, the string S is "aaabbbcccdddddd". Let's build the layers:
 * - Layer 1 (needs 1 char) : "a" -> Homogeneous! (Count = 1)
 * - Layer 2 (needs 2 chars): "aa" -> Homogeneous! (Count = 2)
 * - Layer 3 (needs 3 chars): "bbb" -> Homogeneous! (Count = 3)
 * - Layer 4 (needs 4 chars): "cccd" -> NOT homogeneous ('c' and 'd').
 * - Layer 5 (needs 5 chars): "ddddd" -> Homogeneous! (Count = 4)
 * Characters left: "d" (only 1 char left, but Layer 6 needs 6 chars, so we stop).
 *
 * Total homogeneous layers = 4.
 */
public class HomogeneousLayers {

    public static int countHomogeneousLayers(String s) {
        int count = 0;
        int layerSize = 1;
        int i =0;
        while(i+layerSize<=s.length()){

            String layer = s.substring(i,i+layerSize);
            if(isHomogeneous(layer))count++;

            i+=layerSize;
            layerSize++;
        }
    }

    public static boolean isHomogeneous(String layer) {
        char ch = layer.charAt(0);
        for (int i = 1 ; i<layer.length() ; i++){
            if(layer.charAt(i)!=ch){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String input1 = "aaabbbcccdddddd";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + countHomogeneousLayers(input1));
        // Expected Output: 4

        // Test Case 2 (Custom Test Case)
        String input2 = "abcccd";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + countHomogeneousLayers(input2));
        // Expected Output: 1
        // Explanation:
        // L1: "a" (Yes)
        // L2: "bc" (No)
        // L3: "ccd" (No)
        // Only 1 homogeneous layer formed.
    }
}