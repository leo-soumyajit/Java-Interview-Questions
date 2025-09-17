public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0 , maxCount = 0;
        for (int i : arr){
            if (i == 1){
                count++;
            }else{
                count=0;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));

    }
}
