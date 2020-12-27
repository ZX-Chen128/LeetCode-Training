package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/11/30 2:06 下午
 */

/**
 * 示例 1：
 * <p>
 * 输入：grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
 * 输出：16
 * 解释：它的周长是上面图片中的 16 个黄色的边
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：grid = [[1]]
 * 输出：4
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：grid = [[1,0]]
 * 输出：4
 */

public class IslandPerimeter {

    private int m;
    private int n;

    public int islandPerimeter(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }

    public int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return 1;
        }
        if (grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == 2) {
            return 0;
        }
        grid[i][j] = 2;

        return dfs(grid, i - 1, j) + dfs(grid, i + 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1);
    }

}
