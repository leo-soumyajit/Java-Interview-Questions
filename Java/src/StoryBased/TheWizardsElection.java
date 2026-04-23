
package StoryBased;

import java.util.*;

public class TheWizardsElection {


    public static int findWinner(int N, int[] A) {
        // Write your code here
        HashMap<Integer,Integer> hs = new HashMap();
        int max = 0;
        int res = 0;

        for(int i = 0 ; i<A.length ; i++){
            if(!hs.containsKey(A[i])){
                hs.put(A[i], hs.getOrDefault(A[i],1));
            }else{
                hs.put(A[i],(hs.get(A[i]))+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hs.entrySet()){
            if(max<entry.getValue()){
                max = entry.getValue();
                res = entry.getKey();
            }else if(max==entry.getValue()){
                if(entry.getKey()<res){
                    res = entry.getKey();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(findWinner(N, A));
        sc.close();
    }
}
