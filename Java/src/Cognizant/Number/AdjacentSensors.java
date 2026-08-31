package Cognizant.Number;

import java.util.Arrays;

/**
 * 📝 Problem: Greater Adjacent Sensors
 *
 * Problem Statement:
 * Given an array A of N sensors, determine how many adjacent sensors are greater
 * than each sensor.
 * - First element compares with second and last.
 * - Last element compares with second-last and first.
 * - Others compare with left and right neighbors.
 *
 * Input Specification:
 * input1 : N (Size of array)
 * input2 : Array A
 *
 * Output Specification:
 * Return an integer array containing the counts.
 */
public class AdjacentSensors {

    public static int[] countGreaterAdjacent(int N, int[] arr) {

        // Output store korar jonno notun array
        int[] result = new int[N];

        // Tor logic ekhane likh...
        // Ekta for loop chala (i = 0 theke N-1 obdi)
        // Bhetore duto variable ne: leftNeighbour ar rightNeighbour
        // If (i == 0) -> leftNeighbour = A[N-1], rightNeighbour = A[i+1]
        // Else If (i == N-1) -> leftNeighbour = A[i-1], rightNeighbour = A[0]
        // Else -> leftNeighbour = A[i-1], rightNeighbour = A[i+1]

        // Tarpor check kor leftNeighbour ar rightNeighbour ki A[i] er theke boro?
        // Boro hole count bariye result[i] te bosiye de.
        int leftmax=0;
        int rightmax = 0;
        for (int i = 0 ; i<arr.length ; i++){
            int count=0;
            if(i==0){
                leftmax=arr[N-1];
                rightmax=arr[i+1];
            }
            else if(i==N-1){
                leftmax=arr[i-1];
                rightmax=arr[0];

            }else{
                leftmax=arr[i-1];
                rightmax=arr[i+1];
            }
            if(arr[i]<leftmax)count++;
            if(arr[i]<rightmax)count++;
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        int input1 = 5;
        int[] input2 = {10, 15, 12, 9, 14};

        System.out.println("--- Test Case 1 ---");
        System.out.println("Input Array: " + Arrays.toString(input2));

        int[] output = countGreaterAdjacent(input1, input2);
        System.out.println("Output: " + Arrays.toString(output));
        // Expected Output: [2, 0, 1, 2, 0]
    }
}