package Math;

public class ReverseNumber {
    public static int Reverse_Number(int n){
        int rev = 0;
        while(n!=0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(Reverse_Number(n));

    }
}
