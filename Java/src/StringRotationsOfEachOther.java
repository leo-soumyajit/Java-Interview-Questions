public class StringRotationsOfEachOther {
    public static boolean areRotations(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        String s3 = s1+s1;
        return s3.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotations(s1,s2));
    }
}
