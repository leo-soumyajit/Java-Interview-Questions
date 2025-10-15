package PatternPrinting;

public class NumberIncreasingPattern {
    public static void NumberIncreasingPatternPrint(int n){
        for (int i = 1 ; i<=n ; i++){
            int count = 0;
            for (int j = 1 ; j<=i ; j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberIncreasingPatternPrint(5);
    }
}
