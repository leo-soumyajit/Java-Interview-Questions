package StoryBased;

import java.util.*;

public class TheRoyalPalindrome {

    //using O(N) space complexity
//    public static boolean isPalindrome(String s) {
//        // Write your clever two-pointer magic here
//        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//
//        int st = 0 , end = s.length()-1;
//        while(st<=end){
//            if(s.charAt(st)!=s.charAt(end))return false;
//            else{
//                st++;
//                end--;
//            }
//        }
//        return true;
//    }


    //using O(1) space complexity
    public static boolean isPalindrome(String s) {
        // Write your clever two-pointer magic here
        int st = 0 , end = s.length()-1;
        while(st<=end){
            while(st< end && !Character.isLetterOrDigit(s.charAt(st)))st++;
            while(st< end && !Character.isLetterOrDigit(s.charAt(end)))end--;

            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end)))return false;
            st++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
        sc.close();
    }
}