package Cognizant.Number;

/**
 * 📝 Problem: Logical OR Operation
 *
 * Problem Statement:
 * You are given two integers A and B. Your task is to find and return an integer
 * representing the value of their logical (bitwise) OR operation.
 *
 * Input Specification:
 * input1 : An integer value A
 * input2 : An integer value B
 *
 * Output Specification:
 * Return an integer representing the value of their logical OR operation.
 *
 * Example 1:
 * input1 : 5
 * input2 : 9
 * Output : 13
 */
public class LogicalOperation {

    public static int logicalOr(int input1, int input2) {

        // Tor logic ekhane likh...
        // Hint: Java te bitwise OR korar jonno shudhu '|' operator use kora hoy.
        // Mane direct input1 ar input2 ke OR kore return kore de!

        return input1|input2; // Replace this
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        int input1 = 5;
        int input2 = 9;

        System.out.println("--- Test Case 1 ---");
        System.out.println("Input A: " + input1);
        System.out.println("Input B: " + input2);
        System.out.println("Output: " + logicalOr(input1, input2));
        // Expected Output: 13
    }
}