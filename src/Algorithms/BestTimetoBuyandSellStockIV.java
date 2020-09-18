package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/18 3:27 下午
 */

/**
 * 示例 1:
 * <p>
 * 输入: [2,4,1], k = 2
 * 输出: 2
 * 解释: 在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
 * 示例 2:
 * <p>
 * 输入: [3,2,6,5,0,3], k = 2
 * 输出: 7
 * 解释: 在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
 *      随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。
 */

public class BestTimetoBuyandSellStockIV {

    public static int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;

        int[][][] dp = new int[len][k + 1][2];

        for (int i = 0; i <= k; i++) {
            // 进行了不超过i次交易 手上无股票
            dp[0][i][0] = 0;
            // 进行了不超过i次交易 手上有股票
            if (i != k) dp[0][i][1] = -prices[0];
        }

        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= k; j++) {
                if (j == 0) {
                    dp[i][j][0] = dp[i - 1][j][0];
                } else {
                    dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j - 1][1] + prices[i]);
                }
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j][0] - prices[i]);
            }
        }
        return dp[len - 1][k][0];
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
        System.out.println(maxProfit(2, new int[]{2, 4, 1}));
    }

}
