package Cognizant;

import java.util.*;

/**
 * 📝 Problem: Most Frequently Occurring Letter Pair
 *
 * Problem Statement:
 * You are reading an article where you are given a string S representing a sentence.
 * Your task is to find and return a string value representing the most frequently
 * occurring letter pair (start letter, end letter) in the sentence.
 *
 * Note (Tie-breaker logic):
 * - If multiple pairs have the same maximum frequency, return them in the order
 *   they appear in the sentence.
 *
 * Input Specification:
 * input1 : A string value S representing the sentence.
 *
 * Output Specification:
 * Return a string value representing the most frequently occurring letter pair.
 *
 * Example 1:
 * input1: "she is good grid god and ground player plotter"
 * Output: "gd"
 *
 * Explanation:
 * Pairs formed: se, is, gd, gd, gd, ad, gd, pr, pr.
 * Frequency: se(1), is(1), gd(4), ad(1), pr(2).
 * Max frequency is 'gd' with 4.
 */

public class MostFrequentPair {

    public static String findMostFrequentPair(String s) {

        String[] words = s.split(" ");
        // LinkedHashMap used to maintain insertion order for the tie-breaker
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            char f = word.charAt(0);
            char l = word.charAt(word.length() - 1);
            String pair = f + "" + l;
            map.put(pair, map.getOrDefault(pair, 0) + 1);
        }

        int maxFreq = 0;
        String result = "";

        // KeySet approach for max frequency calculation
        for (String word : map.keySet()) {
            int currMax = map.get(word);
            // Strictly greater than (>) ensures that the first occurring pair stays
            // if there's a tie in maximum frequency.
            if (currMax > maxFreq) {
                maxFreq = currMax;
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input1 = "she is good grid god and ground player plotter";
        System.out.println("Output: " + findMostFrequentPair(input1));
        // Expected Output: gd
    }
}