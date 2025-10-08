package String;

public class Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        int st = 0 , end = arr.length-1;
        while (st<end){
            String temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        return String.join(" ",arr).trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
//Example 1:
//
//Input: s = "the sky is blue"
//Output: "blue is sky the"