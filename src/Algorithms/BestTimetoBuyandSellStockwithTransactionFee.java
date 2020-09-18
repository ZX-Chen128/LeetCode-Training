package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/17 6:06 下午
 */

/**
 * 示例 1:
 * <p>
 * 输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
 * 输出: 8
 * 解释: 能够达到的最大利润:
 * 在此处买入 prices[0] = 1
 * 在此处卖出 prices[3] = 8
 * 在此处买入 prices[4] = 4
 * 在此处卖出 prices[5] = 9
 * 总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 */

public class BestTimetoBuyandSellStockwithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;

        int[][] dp = new int[len][2];

        // 未持股
        dp[0][0] = 0;
        // 持股
        dp[0][1] = -prices[0];

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
        }
        return Math.max(dp[len - 1][0], dp[len - 1][1] + prices[len - 1] - fee);
    }

}
