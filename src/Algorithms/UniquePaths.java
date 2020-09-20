package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/12 3:56 下午
 */

/**
 * 示例 1:
 *
 * 输入: m = 3, n = 2
 * 输出: 3
 * 解释:
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向右 -> 向下
 * 2. 向右 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向右
 * 示例 2:
 *
 * 输入: m = 7, n = 3
 * 输出: 28
 *
 */

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        for (int i = 0; i < m; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j][i] =  dp[j-1][i] + dp[j][i-1];
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(7,3));
        System.out.println(uniquePaths(3,2));
    }
}
