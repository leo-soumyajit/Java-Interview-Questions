package Cognizant;

import java.util.Scanner;

/**
 * 📝 Problem: ABS School Grading System
 *
 * Problem Statement:
 * ABS School wants to provide grades to students according to their marks.
 * Their Grading Policy is as follows:
 * Marks
 * 10-40 = F
 * 41-50 = C
 * 51-60 = B
 * 61-80 = A
 * 81-100 = S
 * All other inputs print "invalid"
 *
 * Input Format:
 * Total number of inputs (N)
 * List of marks (space-separated)
 *
 * Output Format:
 * List of grades (space-separated)
 *
 * Example:
 * Input:
 * 5
 * 81 61 51 41 11
 *
 * Output:
 * S A B C F
 */
public class StudentGrader {

    public static String getGrades(int n, int[] arr) {

        // Ekta StringBuilder toiri kor, jate string build kora easy hoy
        StringBuilder s = new StringBuilder();

        // Tor logic ekhane likh...
        // Pura marks array-tar upor loop chala ar if-else if diye range check kor.
        // Proti grade pawar por result.append(grade).append(" "); korbi jate space thake.

        for (int i : arr){
            if(i<=40 && i>=10)s.append('F').append(' ');
            else if(i<=50 && i>=41)s.append('C').append(' ');
            else if(i<=60 && i>=51)s.append('B').append(' ');
            else if(i<=80 && i>=61)s.append('A').append(' ');
            else if(i<=100 && i>=81)s.append('S').append(' ');
            else if(i>100)break;
        }


        // Ekdam shesh-er space-ta kete return korar jonno .trim() use korte paris
        return s.toString().trim();
    }

    public static void main(String[] args) {
        // Test Case 1 (From Question)
        int n1 = 5;
        int[] marks1 = {81, 61, 51, 41, 11};
        System.out.println("--- Test Case 1 ---");
        System.out.println("Output: " + getGrades(n1, marks1));
        // Expected Output: S A B C F

        // Test Case 2 (Custom Test Case with Invalid inputs)
        int n2 = 4;
        int[] marks2 = {45, 5, 105, 90};
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Output: " + getGrades(n2, marks2));
        // Expected Output: C invalid invalid S
    }
}