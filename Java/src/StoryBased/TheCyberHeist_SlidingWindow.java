package StoryBased;
import java.util.*;

public class TheCyberHeist_SlidingWindow {

    public static int extractMaxData(int N, int K, int[] arr) {
        // Your O(N) Sliding Window logic here
        int sum =0;
        int max =0;
        for (int i = 0 ; i<K;i++){
            sum +=arr[i];
        }
        max = Math.max(max,sum);

        for (int i = K; i< arr.length;i++){
            sum += arr[i]-arr[i-K];
            max = Math.max(max,sum);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] dataBlocks = new int[N];
        for (int i = 0; i < N; i++) {
            dataBlocks[i] = sc.nextInt();
        }

        System.out.println(extractMaxData(N, K, dataBlocks));
        sc.close();
    }
}