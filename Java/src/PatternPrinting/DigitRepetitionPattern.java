package PatternPrinting;

public class DigitRepetitionPattern {
    public static void DigitRepetitionPatternPrint(int n){
        int count = 0;
        for (int i = 1 ; i<=n ; i++){
            count++;
            for (int j = 1 ; j<=i ; j++){
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DigitRepetitionPatternPrint(5);
    }
}
