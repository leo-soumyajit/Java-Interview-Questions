public class countWordsInString {
    public static int count(String str){
        String [] s = str.split("\\s+");
        return s.length;
    }

    public static void main(String[] args) {
        System.out.println(count("Welcome to Java World     "));
    }
}
//i/p - Welcome to Java World
//o/p - 4