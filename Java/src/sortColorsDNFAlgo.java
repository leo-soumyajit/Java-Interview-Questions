//Dutch National Flag Algorithm for sort 3 colors

public class sortColorsDNFAlgo {
    public static void DNFAlgo(int[] arr){
        int st = 0 , mid = 0, end = arr.length-1;
        while (mid<=end){
            if(arr[mid]==0){
                swap(arr,st,mid);
                st++;
                mid++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr,mid,end);
                end--;
            }
        }

    }
    public static void swap(int[] arr, int st, int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        DNFAlgo(arr);
        for (int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
