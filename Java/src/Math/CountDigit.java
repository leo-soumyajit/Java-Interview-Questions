package Math;

public class CountDigit {
    public static int count_digit(int n){
        int count = 0;
        while (n!=0){
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 221;
        System.out.println(count_digit(number));
    }
}
