package Math;

public class PalindromeNumber {
    public static boolean isPalindromeNumber(int n){
        int rev = 0 , original = n;
        while(n!=0){
            int digit = n % 10;
            rev = rev*10+digit;
            n /=10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        int n = 11211;
        System.out.println(isPalindromeNumber(n));
    }
}
