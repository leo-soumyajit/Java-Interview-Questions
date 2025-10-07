package String;

public class Reverse_String {
    public static void reverseString(char[] arr) {
        int st = 0 , end = arr.length-1;
        while(st<end){
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(arr);
    }
}
//344. Reverse String
//Example 1:
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
