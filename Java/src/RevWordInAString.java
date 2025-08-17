public class RevWordInAString {
    public static void Reverse(String str){
        String[] s = str.split("\\s+");
        int st = 0, end = s.length-1;
        while(st<end){
            String temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }
        System.out.println(String.join(" ",s).trim());
    }

    public static void main(String[] args) {
        Reverse("Java is good programming langauges");
    }
}
