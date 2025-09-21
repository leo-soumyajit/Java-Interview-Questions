import java.util.Arrays;

public class AddNumberWithConditions {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(addNumber(arr)));
    }
    public static int[] addNumber(int[] arr){
        for (int i = 0 ; i< arr.length ; i++){
            if(arr[i] < 30){
                arr[i]+=10;
            }else if(arr[i]>30){
                arr[i]+=20;
            }
        }
        return arr;
    }
}
