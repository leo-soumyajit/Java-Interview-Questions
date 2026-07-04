package StoryBased;

import java.util.*;

public class TheCrystalMinersOverload {

    public static int calculateTotalDamage(int N, int C, int[] arr) {
        // Write your clever battery-capping magic here
        int battery = 0, totalDamage = 0;

        for (int i = 0 ; i<N ; i++){
            battery +=arr[i];
            if(arr[i]>0){
                if(battery<C){
                    totalDamage += (battery-C);
                    battery = C;
                }
            }
            else {
                battery -= arr[i];
                if(battery<0){
                    totalDamage += battery;
                }
            }
        }

        return totalDamage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt(); // Max Capacity
        int[] crystals = new int[N];
        for (int i = 0; i < N; i++) {
            crystals[i] = sc.nextInt();
        }

        System.out.println(calculateTotalDamage(N, C, crystals));
        sc.close();
    }
}


//Input:
//N = 5
//C = 10
//crystals = [5, 8, -4, -15, 6]
//
//Expected Output: 12