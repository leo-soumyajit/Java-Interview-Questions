package String;

public class RevEachWordInAString {

    public static void ReverseWithLibrary(String str){
        String[] s = str.split("\\s+");
        StringBuilder output = new StringBuilder();

        for(String word : s){
            StringBuilder sb = new StringBuilder(word);
            output.append(sb.reverse()).append(" ");
        }

        System.out.println(output.toString().trim());
    }

    public static void ReverseWithOutLibrary(String str){
        String[] s = str.split("\\s+");
        StringBuilder output = new StringBuilder();

        for (String word : s){
            for(int i = word.length()-1 ; i>=0 ; i--){
                output.append(word.charAt(i));
            }
            output.append(" ");
        }
    }


    public static void main(String[] args) {
        ReverseWithLibrary("Java is good programming langauges");
        ReverseWithOutLibrary("Java is good programming langauges");
    }



}
