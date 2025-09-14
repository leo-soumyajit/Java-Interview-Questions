public class sumOnlyOfIntegerValues {
    public static void main(String[] args) {
        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
        System.out.println(sumOfIntOnly(array));
    }
    public static int sumOfIntOnly(String[] arr){
        int sum = 0;
        for(String str : arr){
            try{
                sum += Integer.parseInt(str);
            }catch (NumberFormatException e){
                //ignore
            }
        }
        return sum;
    }
}
