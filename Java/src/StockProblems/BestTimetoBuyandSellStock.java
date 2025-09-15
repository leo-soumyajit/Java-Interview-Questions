package StockProblems;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] arr){
        int max = 0 , minsofa = arr[0];
        for (int i = 0; i<arr.length ; i++){
            minsofa = Math.min(minsofa,arr[i]);
            int maxProf = arr[i] - minsofa;
            max = Math.max(maxProf,max);
        }
        return max;
    }
}
//121. Best Time to Buy and Sell Stock (Leetcode)
