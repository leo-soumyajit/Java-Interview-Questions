import java.util.Arrays;

public class SelectionSort {
    public static void SelectionSortFunc(int[] arr){
        for(int i = 0 ; i<arr.length-1 ; i++){
            int min = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,1,1,2,5,0};
        SelectionSortFunc(arr);
        System.out.println(Arrays.toString(arr));
    }
}
