package StoryBased;

import java.util.*;

public class MagicalTwinStones {

    public static boolean hasTwinStones(int N, int K, int[] A) {
        // Write your code here
        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int i = 0 ; i<A.length ; i++){
            if(hs.containsKey(A[i])){
                int oldIndex = hs.get(A[i]);
                hs.put(A[i],i);
                if(i-oldIndex<=K)return true;
            }
            else{
                hs.put(A[i],i);
            }
        }


        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(hasTwinStones(N, K, A));
        sc.close();
    }
}