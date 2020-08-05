package Algorithms;

public class BestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = prices.length - 1;
        int profit = 0;
        while(left < right){
            if(prices[left] > prices[right]){
                left++;
            } else {
                int current = prices[right] - prices[left];
                if(current>profit){
                    profit = current;
                } else {
                    right--;
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(BestTimetoBuyandSellStock.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
