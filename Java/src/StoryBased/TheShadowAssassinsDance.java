package StoryBased;

import java.util.*;

public class TheShadowAssassinsDance {

    public static int countSpinMoves(int N, int[] arr) {
        // Write your clever direction-tracking magic here
        int spin = 0;
        int cr = 0;

        for (int i = 0 ; i<N ; i++){
            if(arr[i]>0){
                if(cr==-1){

                    spin++;
                }
                cr=1;

            }else if(arr[i]<0){
                if(cr==1){

                    spin++;
                }
                cr=-1;
            }
        }

        return spin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] moves = new int[N];
        for (int i = 0; i < N; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(countSpinMoves(N, moves));
        sc.close();
    }
}
//Input:
//5
//2 5 -3 0 4
//Output: 2