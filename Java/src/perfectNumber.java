//A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

//Example 1:
//Input: num = 28
//Output: true
//Explanation: 28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, and 14 are all divisors of 28.

//Example 2:
//Input: num = 7
//Output: false

import java.util.Scanner;

public class perfectNumber {
    public static boolean perfectN(int n){
        int sum = 0;
        for(int i = 1; i<n ; i++){
            if(n % i == 0) sum +=i;
        }
        return sum==n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(perfectN(n));
    }
}
