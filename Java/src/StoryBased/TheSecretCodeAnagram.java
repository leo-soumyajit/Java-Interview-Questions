package StoryBased;
import java.util.*;


public class TheSecretCodeAnagram {

    public static boolean isAnagram(String s, String t) {
        // Write your clever string magic here
        if(s.length()!=t.length())return false;
        char[] arr1 = new char[26];

        for(int i = 0 ; i<s.length() ; i++){
            arr1[s.charAt(i)-'a']++;
        }

        for(int i = 0 ; i<t.length() ; i++){
            arr1[t.charAt(i)-'a']--;
        }

        for(int i = 0 ; i<arr1.length ; i++) {
            if (arr1[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(isAnagram(s, t));
        sc.close();
    }


}
