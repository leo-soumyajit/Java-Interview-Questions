


package StoryBased;// 📝 Problem: The Treasure Hunter's Bag
// Story:
// Bikram is a treasure hunter exploring a straight magical tunnel with N chambers. Each chamber contains an integer value A[i] representing the number of magical coins. However, some chambers are cursed and contain negative numbers (meaning Bikram would lose that many coins).
// Bikram wants to collect coins from a contiguous sequence of chambers. But his magical bag has a strict rule: if he ever tries to put a negative number of coins into the bag, the bag will freeze, and his run will end immediately (meaning he cannot include that negative chamber or any chamber after it in that specific run).
// Help Bikram find the maximum total coins he can collect in a single valid sequence. If all chambers are cursed, he should just stay home and collect 0 coins.
// Constraints:
// 1 <= N <= 10^5
// -10^9 <= A[i] <= 10^9

// 🧪 Test Case 1: The Standard Split
// Input: ```text 5 10 20 -5 40 50
// **Output:** ```text
// 90
// Explanation: Bikram has two valid contiguous sequences he can choose from:
// He can collect from the first two chambers (10 + 20 = 30). When he hits the 3rd chamber, the -5 will freeze his bag, so he must stop there.
// He can skip the first part entirely and collect from the 4th and 5th chambers (40 + 50 = 90). The maximum value between these two valid sequences is 90. Therefore, the output is 90.

// 🧪 Test Case 2: The "All Cursed" Trap
// Input: ```text 3 -10 -5 -20
// **Output:** ```text
// 0

// Explanation: Every single chamber contains a negative value (they are all cursed). The problem statement clearly mentions: "If all chambers are cursed, he should just stay home and collect 0 coins." Therefore, the answer is 0. This is a classic edge case designed to trick people who initialize their maximum sum variable to negative infinity without reading the story carefully!

// 🧪 Test Case 3: The "Integer Overflow" Trap
// Input: ```text 4 1000000000 1000000000 1000000000 -1
// **Output:** ```text
// 3000000000

// Explanation: If Bikram collects from the first 3 chambers, he will gather 10^9 + 10^9 + 10^9 = 3 * 10^9 coins. Here is the trap: 3,000,000,000 is strictly greater than the maximum limit of a standard 32-bit Java int (which caps at roughly 2.14 billion). If you use a standard int variable to store this sum, it will overflow, turn into a negative garbage value, and fail the hidden test cases. You absolutely must use a long datatype to store your sum.

import java.util.*;

public class TheTreasureHuntersBag {
    
    // Toke sudhu ei function ta complete korte hobe
    public static long findMaxCoins(int N, int[] array) {
        // Write your code here
        long sum = 0;
        long sumx = 0;

        for(int i = 0 ; i<array.length ; i++){
            if(array[i]>0){
                sum += array[i];

            }
            else if(array[i]<0){
                sum = 0;
            }
            sumx = Math.max(sumx,sum);
        }
        return sumx;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(findMaxCoins(N, A));
        sc.close();
    }
}
