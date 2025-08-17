public class CountVowelAndConst {
    public static void Counter(String str){
        int countV =0 , countC = 0;
        for (int i = 0 ; i<str.length() ; i++){
            if(isVowel(str.charAt(i))){
                countV++;
            }else {
                countC++;
            }
        }
        System.out.println(countC);
        System.out.println(countV);
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Counter("Swastika is a gudi");
    }
}
