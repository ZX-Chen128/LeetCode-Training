package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/18 10:28 上午
 */

/**
 * 示例:
 * <p>
 * 输入: [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 */

public class BestTimetoBuyandSellStockwithCooldown {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len < 2) return 0;

        int[][] dp = new int[len][3];

        // 不持股且能购买
        dp[0][0] = 0;
        // 持股
        dp[0][1] = -prices[0];
        // 不持股且不能购买(冷冻期)
        dp[0][2] = 0;

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][2], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
            dp[i][2] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][2]);
        }

        return Math.max(dp[len - 1][0], dp[len - 1][2]);
    }

}
