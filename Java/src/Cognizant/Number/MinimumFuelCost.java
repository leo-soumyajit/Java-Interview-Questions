package Cognizant.Number;

/**
 * 📝 Problem: Minimum Fuel Cost for Transport Hard
 *
 * Problem Statement:
 * Transport N people using Buses (capacity 80) and Shuttles (capacity 8).
 * Fuel costs 75 coins per litre. Bus uses P litres, Shuttle uses Q litres.
 * Find the minimum cost to transport all N people.
 */


public class MinimumFuelCost {

    public static int findMinCost(int N, int P, int Q) {

        // 1. Aage fuel-er daam ar gari gulor khoroch (cost) hisheb kore ni
        int fuelPrice = 75;
        int busCost = P * fuelPrice;       // Ekta bus-er khoroch
        int shuttleCost = Q * fuelPrice;   // Ekta shuttle-er khoroch

        // Minimum cost track korar jonno ekt boro value diye shuru korlam
        int minTotalCost = Integer.MAX_VALUE;

        // 2. Sobtheke beshi koyta bus lagte pare?
        // Jodi sobai bus-e jay, tahole (Total lok / 80) + 1 ta bus lagte pare max.
        int maxBuses = (N / 80) + 1;

        // 3. Ebar shob option check korbo (0 ta bus theke shuru kore max bus obdi)
        for (int b = 0; b <= maxBuses; b++) {

            // Bus-e koto lok gelo, ar baki kotojon thaklo?
            int remPeople = N - (b * 80);

            // Jodi baki lok negative hoye jay (mane bus-e shobai dhukeo seat faka),
            // tahole baki lok 0 dhore nebo.
            if (remPeople < 0) {
                remPeople = 0;
            }

            // 4. Oi baki lokeder jonno koyta shuttle lagbe?
            // (remPeople + 7) / 8 -> Eta holo ceiling (uporer dike round) korar technique
            int shuttles = (remPeople + 7) / 8;

            // 5. Ei option-e total koto taka khoroch hocche?
            int currentCost = (b * busCost) + (shuttles * shuttleCost);

            // 6. Jodi ei khoroch-ta aager record kora minimum-er thekeo kom hoy,
            // tahole etakei notun minimum hishebe save kore rakhbo.
            minTotalCost = Math.min(minTotalCost, currentCost);
        }

        // Khela shesh, shobcheye kom khoroch-ta return kore de
        return minTotalCost;
    }

    public static void main(String[] args) {
        // Test Case 1
        int input1_1 = 240;
        int input2_1 = 50;
        int input3_1 = 8;

        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + findMinCost(input1_1, input2_1, input3_1));
        // Expected Output: 11250

        // Test Case 2
        int input1_2 = 95;
        int input2_2 = 60;
        int input3_2 = 10;

        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + findMinCost(input1_2, input2_2, input3_2));
        // Expected Output: 6000
    }
}