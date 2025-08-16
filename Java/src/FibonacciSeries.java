import java.util.Scanner;

public class FibonacciSeries {
    public static int FibonacciSeries(int n){
        if(n==0 || n==1){
            return n;
        }
        return FibonacciSeries(n-1)+FibonacciSeries(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i = 0 ; i<=n ; i++) {
            System.out.println(FibonacciSeries(i));
        }
    }
}
