package StockProblems;

public class BestTimetoBuyandSellStock_II {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] arr){
        int res = 0;
        for(int i = 1; i< arr.length ; i++){
            if(arr[i-1]<arr[i]){
                res += arr[i]-arr[i-1];
            }
        }
        return res;
    }
}
