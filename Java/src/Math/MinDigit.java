package Math;

public class MinDigit {
    public static int minDigit(int n){
        int rev = 9;
        while(n!=0){
            int digit = n%10;
            if(digit < rev) rev = digit;
            n /=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 1919;
        System.out.println(minDigit(n));
    }
}
