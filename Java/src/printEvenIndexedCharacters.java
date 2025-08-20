public class printEvenIndexedCharacters {
    public static void printEvenIndexedCharacters(String str){
        for (int i = 0 ; i<str.length() ; i++){
            if(i%2==0){
                System.out.print(str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
//        print even indexed characters
        String str = "Automation";
        printEvenIndexedCharacters(str);
    }
}
