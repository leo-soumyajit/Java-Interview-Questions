import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class printUniqueCharacters {

    public static String printUniqueCharacters(String str){
        TreeSet<Character> hs = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i<str.length() ; i++){
            if(!hs.contains(str.charAt(i))){
                hs.add((str.charAt(i)));
                if(str.charAt(i)==' '){
                    continue;
                }
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(printUniqueCharacters("Java Automation"));
    }
}
