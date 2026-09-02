package Cognizant.Number;

/**
 * 📝 Problem: Tall Buildings Sum
 *
 * Problem Statement:
 * Given an array H of N buildings and an integer D. A building at index i is tall if:
 * - It is strictly greater than the building at i - D (if it exists).
 * - It is strictly greater than the building at i + D (if it exists).
 * Return the sum of heights of all tall buildings.
 */


public class TallBuildings {

    public static int sumOfTallBuildings(int N, int[] arr, int D) {
        int sum = 0;
        for (int i = 0 ; i<arr.length ; i++){
            boolean isLeftTall = false;
            boolean isRightTall = false;

            if(i-D<0)isLeftTall=true;
            else {
                if(arr[i]>arr[i-D])isLeftTall=true;
            }

            if(i+D>=N)isRightTall=true;
            else{
                if(arr[i]>arr[i+D])isRightTall=true;
            }
            if(isRightTall && isLeftTall)sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test Case 1
        int N1 = 6;
        int[] H1 = {1, 3, 2, 1, 5, 4};
        int D1 = 2;
        System.out.println("Output: " + sumOfTallBuildings(N1, H1, D1));
        // Expected Output: 12
    }
}