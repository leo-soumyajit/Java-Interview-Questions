package BinarySearch;

//same ans for 852. Peak Index in a Mountain Array

public class Find_Peak_Element {
    public static int findPeakElement(int[] arr) {
        int st = 0 , end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid== arr.length-1 || arr[mid]> arr[mid+1])){
                return mid; // return index
            }
            //find peak idx in after current mid val
            else if(arr[mid]<arr[mid+1]) st = mid+1;
            else end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
}
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: 2
//Explanation: 3 is a peak element and your function should return the index number 2.
