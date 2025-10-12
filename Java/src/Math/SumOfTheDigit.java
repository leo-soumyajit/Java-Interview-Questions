package Math;

public class SumOfTheDigit {
    public static int sum_of_d_digits(int n){
        int rev = 0;
        while(n!=0){
            int digit = n % 10;
            rev = rev +digit;
            n /=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 1111;
        System.out.println(sum_of_d_digits(n));
    }
}
