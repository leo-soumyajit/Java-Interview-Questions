package PatternPrinting;

public class ZeroOneTriangle {
    public static void ZeroOneTrianglePrint(int n){
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                // if the sum of (i+j) is even then print 1
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    //otherwise 0
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ZeroOneTrianglePrint(5);
    }
}
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1