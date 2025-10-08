package BinarySearch;

public class SearchInRotatedSortedArray {
    public static boolean search(int[] arr, int target) {
        int st = 0 , end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==target)return true;
            //checking if duplicate
            if(arr[mid]==arr[st] && arr[mid] == arr[end]){
                st++;
                end--;
            }
            else if(arr[mid]<=arr[end]){
                if(arr[mid]<target && arr[end]>=target){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(arr[mid]>target && arr[st]<=target){
                    end = mid-1;

                }else{
                    st = mid+1;
                }
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
}
