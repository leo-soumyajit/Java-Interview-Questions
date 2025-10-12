package Math;

public class Factorial {
    public static int factorialIterative(int n){
        int fact = 1;
        for (int i = 1 ; i<=n ; i++){
            fact *= i;
        }
        return fact;
    }

    public static int factorialRecurssive(int n){
        if(n==1)return n;
        return n*factorialRecurssive(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial using iterative : "+factorialIterative(n));
        System.out.println("Factorial using recursion : "+factorialRecurssive(n));
    }
}
