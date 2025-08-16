public class PrimeNumber {
    public static boolean PrimeNumber(int n){
        int count = 1;
        for(int i = 2 ; i<=n ; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber(7));
    }
}
