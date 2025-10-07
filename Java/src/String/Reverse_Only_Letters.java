package String;

public class Reverse_Only_Letters {
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int st = 0 , end = arr.length-1;
        while (st<end){
            if(!Character.isLetter(arr[st]))st++;
            else if (!Character.isLetter(arr[end]))end--;
            else {
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }
}
//Example 1:
//
//Input: s = "ab-cd"
//Output: "dc-ba"