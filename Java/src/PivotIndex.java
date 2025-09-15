public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivot(arr)); //expected 3;
    }
    public static int pivot(int[] arr){
        int sum = 0;
        for(int i = 0;i< arr.length ; i++){
            sum += arr[i];
        }
        int left = 0;
        int right = sum;
        for(int i = 0 ; i< arr.length ; i++){
            left += arr[i];
            if(left == right){
                return i;
            }
            right-=arr[i];
        }
        return -1;
    }
}
