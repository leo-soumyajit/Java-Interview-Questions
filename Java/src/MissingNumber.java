public class MissingNumber {
    public static int missingN(int[] arr){
        int res = arr.length;
        for (int i = 0;i< arr.length ; i++){
            res += i - arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(missingN(arr));
    }
}
