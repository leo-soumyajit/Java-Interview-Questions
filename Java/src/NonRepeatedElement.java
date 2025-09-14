import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NonRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,5,6,6};
        ArrayList<Integer> res = onlyOnes(arr);
        for (int ele : res) {
            System.out.print(ele + " ");  // Expected output: 3 4
        }
    }

    public static ArrayList<Integer> onlyOnes(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i<arr.length ; i++){
            int count = 0;
            for (int j = 0 ; j< arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                list.add(arr[i]);
            }
        }
        return list;
    }

}
//[1,1,2,2,3,4,5,5,6,6]
//Output – [3,4]