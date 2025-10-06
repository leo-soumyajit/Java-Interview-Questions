public class MissingNumber {
    public static int missingN(int[] arr){
        int res = arr.length;
        for (int i = 0;i< arr.length ; i++){
            res += i - arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingN(arr));
    }
}
