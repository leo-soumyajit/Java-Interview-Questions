import java.util.Arrays;

public class FirstMissingPositive {
    public static int missingFPositive(int[] arr) {
        int res = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == res) res++;
            else if (res < arr[i]) break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11, 12};
        System.out.println(missingFPositive(arr));

    }
}