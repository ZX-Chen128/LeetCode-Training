package Algorithms;

/**
 * 示例 1:
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * 示例 2:
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 输入: [7,5,8,7,1,5]
 *
 * 输出: 4
 *
 */

public class BestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int low = 0;
        int high = 0;
        int right = 0;
        int max = 0;
        while(right < prices.length - 1){
            right++;
            if(prices[right] < prices[low]){
                low = right;
                high = low;
            }
            if(prices[right] > prices[high]){
                high = right;
                max = Math.max(max,prices[high] - prices[low]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(BestTimetoBuyandSellStock.maxProfit(new int[]{3,2,6,5,0,3}));
    }
}
