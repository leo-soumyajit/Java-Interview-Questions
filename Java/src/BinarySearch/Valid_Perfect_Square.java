package BinarySearch;

public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int x) {
        long st = 0 , end = x;
        while(st<=end){
            long mid = st+(end-st)/2;
            if(mid*mid == x)return true;
            else if(mid*mid<x){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Valid_Perfect_Square validPerfectSquare = new Valid_Perfect_Square();
        int num = 16;
        System.out.println(validPerfectSquare.isPerfectSquare(num));
    }
}
