package BinarySearch;

import java.util.Arrays;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static int findMin(int[] arr) {
        int st = 0 , end = arr.length-1;
        while (st<end){
            int mid = st+(end-st)/2;
            if(arr[mid]>arr[end]){
                st = mid+1;
            }
            else if(arr[mid]<arr[end]){
                end = mid;
            }
            else end--;
        }
        return arr[st];
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,0,1};
        System.out.println(findMin(arr));
    }
}
