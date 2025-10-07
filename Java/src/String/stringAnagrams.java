package String;

public class stringAnagrams {
    public static boolean isAnagram(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        int[] arr = new int[26];

        for(int i = 0 ; i<n1; i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(int i = 0 ; i<n2; i++){
            arr[s2.charAt(i)-'a']--;
        }
        for(int i : arr){
            if(i!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1,s2));
    }
}
