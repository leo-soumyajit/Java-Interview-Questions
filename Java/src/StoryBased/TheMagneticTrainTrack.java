package StoryBased;

import java.util.*;

public class TheMagneticTrainTrack {

    public static int findLongestChain(int N, int[] arr) {
        // Your logic here
//5
//1 -1 1 -1 1

        int count = 0;
        int max=0;
        int cr = 0;
        for (int i = 0 ; i<arr.length ; i++){
            if(arr[i]>0){
                if(cr==-1){
                    count++;
                }else{
                    count=1;
                }
                cr=1;
                max = Math.max(max,count);
            } else if (arr[i]<0) {
                if(cr==1){
                    count++;
                }
                else{
                    count=1;
                }
                cr=-1;
                max = Math.max(max,count);
            }else{
                count=0;
                cr=0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] magnets = new int[N];
        for (int i = 0; i < N; i++) {
            magnets[i] = sc.nextInt();
        }

        System.out.println(findLongestChain(N, magnets));
        sc.close();
    }
}