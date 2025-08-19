public class GCDOfTwoNumbers {
    public static int gcdRecursive(int a , int b){
        a = Math.abs(a);
        b = Math.abs(b);

        if(b==0){
            return a;
        }
        return gcdRecursive(b,(a%b));
    }

    public static void main(String[] args) {
        System.out.println(gcdRecursive(366,60));
        System.out.println(gcdIterative(366,60));
    }

    public static int gcdIterative(int a , int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return Math.abs(a);
    }
}
