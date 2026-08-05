package PatternPrinting;

public class NumberChangingPyramid {
    public static void NumberChangingPyramidPrint(int n){
        int count = 0;
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberChangingPyramidPrint(5);
    }
}
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15