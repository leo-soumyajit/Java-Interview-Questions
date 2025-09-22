package BinarySearch;

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(BinarySearch(arr,11));
    }
    public static int BinarySearch(int[] arr,int target){
        int st = 0, end = arr.length-1;

        while(st<end){
            int mid =  st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
