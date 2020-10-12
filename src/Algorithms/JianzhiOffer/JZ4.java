package Algorithms.JianzhiOffer;

/**
 * @Author: Chen Zixin
 * @Date: 2020/10/12 11:23 上午
 */
public class JZ4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        if(n == 0) return false;
        int m = matrix[0].length;
        if(m == 0) return false;
        int line = 0;
        int col = m - 1;
        while (col >= 0 && line < n) {
            if(matrix[line][col] == target) {
                return true;
            } else if(matrix[line][col] > target) {
                col--;
            } else {
                line++;
            }
        }
        return false;
    }

}
