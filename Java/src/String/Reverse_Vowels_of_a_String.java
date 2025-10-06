package String;

import java.util.Arrays;

public class Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int st = 0 , end = arr.length-1;
        while(st<=end){
            if(!isVowel(arr[st])){
                st++;
            } else if (!isVowel(arr[end])) {
                end--;
            }
            else{
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        return String.valueOf(arr);
    }
    private static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
//leetcode : 345
//Example 1:

//Input: s = "IceCreAm"

//Output: "AceCreIm"