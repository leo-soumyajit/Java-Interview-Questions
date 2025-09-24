import java.util.HashSet;

public class CheckStringPangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(s));

    }
    public static boolean isPangram(String s){
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0 ; i<s.length() ; i++){
            hs.add(s.charAt(i));
        }
        return hs.size() == 26;
    }
}
//1832. Check if the Sentence Is Pangram

//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.