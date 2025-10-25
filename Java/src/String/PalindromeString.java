package String;

import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
//        System.out.println(PalindromeStringFunc(s));
        System.out.println(PalindromeStringFuncWithOutExtraSpace(s));
    }
    //this func actually doing reverse
    public static String PalindromeStringFunc(String s){
        char[] ch  = s.toCharArray();
        int st = 0 , end = ch.length-1;
        while(st<end){
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;
            end--;
        }
        return String.valueOf(ch);
    }
    public static Boolean PalindromeStringFuncWithOutExtraSpace(String s){
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int st = 0 , end = s.length()-1;
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            else{
                st++;
                end--;
            }
        }
        return true;
    }

}
