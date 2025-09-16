import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static int[] removeElement(int[] arr,int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i< arr.length ; i++){
            if(arr[i]!=val){
                list.add(arr[i]);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0 ; i< list.size() ; i++){
            result[i] = list.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,3,4};
        System.out.println(Arrays.toString(removeElement(arr, 2)));
    }
}
//leetcode 27 modified