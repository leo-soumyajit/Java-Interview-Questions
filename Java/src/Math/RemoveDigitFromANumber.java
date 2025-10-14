package Math;

public class RemoveDigitFromANumber {
    public static int removeDigit(int n,int toRemove){
        int res = 0 , place = 1;
        while(n!=0){
            int digit = n % 10;
            if(digit!=toRemove){
                res += digit * place;
                place *=10;
            }
            n /=10;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 720;
        System.out.println(removeDigit(n,7));

    }
}
