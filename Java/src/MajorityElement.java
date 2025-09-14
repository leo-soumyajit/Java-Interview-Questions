public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] arr){
        int cand = arr[0];
        int point = 0;
        for (int i = 0 ; i<arr.length ; i++){
            if(point == 0){
                cand = arr[i];
            }
            if(cand == arr[i]){
                point++;
            }else{
                point--;
            }
        }
        return cand;
    }
}
//Leetcode 169
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.