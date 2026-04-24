package StoryBased;

import java.util.*;

public class TheWatchtowers {

    public static long[] findNextTaller(int N, long[] arr) {
        // Write your clever signal magic here
        long[] ans = new long[N];
        Stack<Long> st= new Stack<>();
        for(int i = N-1 ; i>=0 ; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        long[] result = findNextTaller(N, A);
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}