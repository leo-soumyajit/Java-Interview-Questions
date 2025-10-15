package PatternPrinting;

public class RightHalfPyramid {

    public static void PrintRightHalfPyramidPattern(int n){
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintRightHalfPyramidPattern(5);
    }
}
