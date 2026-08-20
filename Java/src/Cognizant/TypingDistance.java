package Cognizant;

public class TypingDistance {

    public static int calculateDistance(String s) {
        int totalDistance = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            totalDistance += Math.abs(s.charAt(i)-s.charAt(i+1));

        }

        return totalDistance;
    }

    public static void main(String[] args) {
        // Test Case 1
        String input1 = "cba";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + calculateDistance(input1));
        // Expected Output: 2

        // Test Case 2
        String input2 = "qrty";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + calculateDistance(input2));
        // Expected Output: 8
    }
}
