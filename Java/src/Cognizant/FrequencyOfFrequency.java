package Cognizant;

import java.util.*;

/**
 * 📝 Problem: Frequency of Frequency
 *
 * Problem Statement:
 * You have a string S of length N with English alphabets in upper case and you have to
 * perform the below operations:
 * - Find the frequency of each alphabet.
 * - Then, find the frequency of the above frequencies.
 * - Finally find which frequency appeared the maximum.
 *
 * Note (Tie-breaker logic):
 * - If there is a conflict in the frequency of two numbers, then choose the smallest one.
 *
 * Input Specification:
 * input1 : An integer value N, representing the length of the string.
 * input2 : A string value S, representing the alphabets with different frequencies.
 *
 * Output Specification:
 * Return an integer value representing the frequency which occurred for maximum alphabets.
 *
 * Example 1:
 * input1: 9
 * input2: ACABABCCA
 * Output: 2
 * Explanation:
 * Frequencies: A=4, B=2, C=3.
 * Freq of Freqs: 4(1 time), 2(1 time), 3(1 time).
 * All appear equally (1 time). Smallest frequency among 2, 3, and 4 is 2.
 *
 * Example 2:
 * input1: 20
 * input2: ACABDDABDCDACFAEGFDA
 * Output: 1
 * Explanation:
 * Frequencies: A=6, B=2, C=3, D=5, E=1, F=2, G=1.
 * Freq of Freqs: 6(1 time), 2(2 times), 3(1 time), 5(1 time), 1(2 times).
 * Max occurrences is 2 (for frequencies 2 and 1). Smallest among 2 and 1 is 1.
 */
public class FrequencyOfFrequency {

    public static int findMaxFrequency(int input1, String input2) {

        // Double HashMap-er jadu
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> map1 = new LinkedHashMap<>();
        char[] arr = input2.toCharArray();

        // 1st freq: Character-er frequency ber kora
        for (char c : arr){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 2nd freq: Frequency-gulor frequency ber kora
        for(char c: map.keySet()){
            map1.put(map.get(c), map1.getOrDefault(map.get(c), 0) + 1);
        }

        int max = -1;
        int res = Integer.MAX_VALUE;

        // Max occurrence khonja ar Tie-breaker apply kora
        for(int i : map1.keySet()){
            int curr = map1.get(i);

            if(curr > max){
                max = curr;
                res = i;
            }
            else if(curr == max){
                // Tie breaker: jodi max same hoy, tahole choto frequency ta nite hobe
                res = Math.min(i, res);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // Test Case 1
        String s1 = "ACABABCCA";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + findMaxFrequency(s1.length(), s1));
        // Expected Output: 2

        // Test Case 2
        String s2 = "ACABDDABDCDACFAEGFDA";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + findMaxFrequency(s2.length(), s2));
        // Expected Output: 1
    }
}