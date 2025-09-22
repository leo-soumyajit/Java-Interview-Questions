package BinarySearch;

public class Sqrt {
    public static int mySqrt(int x) {
        long st = 0 , end = x;
        long ans = 0;
        while(st<=end){
            long mid = st+(end-st)/2;
            if(mid*mid == x)return (int)mid;
            else if(mid*mid < x) {
                st = mid+1;
                ans = mid;
            }
            else{
                end = mid-1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));

    }
}
