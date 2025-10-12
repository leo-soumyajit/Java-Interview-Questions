package Math;

public class MaxDigitFinding {
    public static int maxDigit(int n) {
        int rev = 0;
        while(n!=0){
            int digit = n % 10;
            if(digit > rev) rev = digit;
            n /=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 12123;
        System.out.println(maxDigit(n));
    }
}
