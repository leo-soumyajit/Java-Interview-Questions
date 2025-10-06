package String;

public class Remove_vowels_from_String {
    public static String removeVowels(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        for (int i = 0 ; i<s.length() ; i++){
            if(!isVowel(s.charAt(i))){
                str.append(s.charAt(i));
            }else{
                continue;
            }
        }
        return str.toString();
    }
    private static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "welcome to geeksforgeeks";
        System.out.println(removeVowels(s));

    }
}
