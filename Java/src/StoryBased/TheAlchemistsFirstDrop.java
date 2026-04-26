package StoryBased;

import java.util.*;

public class TheAlchemistsFirstDrop {

    public static int firstVolatileIngredient(String s) {
        // Write your clever frequency magic here
        int[] arr = new int[26];
        for(int i = 0 ; i<s.length() ; i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i = 0 ; i<s.length() ; i++){
            if(arr[s.charAt(i)-'a']==1)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(firstVolatileIngredient(s));
        sc.close();
    }
}