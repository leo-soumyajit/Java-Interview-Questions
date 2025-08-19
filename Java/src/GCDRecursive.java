public class GCDRecursive {
    public static int gcdRecursive(int a , int b){
        a = Math.abs(a);
        b = Math.abs(b);

        if(b == 0){
            return a;
        }
        return gcdRecursive(b,(a%b));
    }

    public static void main(String[] args) {
        System.out.println(gcdRecursive(366,60));
    }
}
