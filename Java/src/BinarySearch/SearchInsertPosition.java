package BinarySearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] arr, int target) {
        int st = 0 , end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) st = mid+1;
            else end = mid-1;
        }
        return st;
    }

    public static void main(String[] args) {
        //test 1 for found value
        int[] arr1 = {1,3,5,6};
        System.out.println(searchInsert(arr1,5));

        //test 2 for not found value and the pos where it will be
        int[] arr2 = {1,3,5,6};
        System.out.println(searchInsert(arr2,7));

    }
}
