import java.util.Arrays;

public class MergeSort {
    private static void mergeSort(int[] arr, int l, int r){
        if(l>=r)return;
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        mergeFunc(arr,l,r,mid);
    }
    private static void mergeFunc(int[] arr, int l, int r, int mid){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0 ; i<n1 ; i++){
            left[i] = arr[l+i];
        }
        for (int j = 0 ; j<n2 ; j++){
            right[j] = arr[mid+j+1];
        }
        int i = 0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }
            else arr[k++] = right[j++];
        }
        while (i<n1){
            arr[k++] = left[i++];
        }
        while (j<n2){
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4 ,1 ,3, 9, 7};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
