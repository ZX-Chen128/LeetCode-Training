package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/11 2:05 下午
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 示例 1:
 * <p>
 * 输入:
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * 输出:
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 * 示例 2:
 * <p>
 * 输入:
 * [
 *   [0,1,2,0],
 *   [3,4,5,2],
 *   [1,3,1,5]
 * ]
 * 输出:
 * [
 *   [0,0,0,0],
 *   [0,4,5,0],
 *   [0,3,1,0]
 * ]
 */

public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> line = new HashSet<>();
        Set<Integer> column = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    line.add(i);
                    column.add(j);
                }
            }
        }
        for (int lineIndex : line) {
            for (int i = 0; i < n; i++) {
                matrix[lineIndex][i] = 0;
            }
        }
        for(int columnIndex : column){
            for (int i = 0; i < m; i++) {
                matrix[i][columnIndex] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 0};
        int[] nums2 = {3, 4, 5, 2};
        int[] nums3 = {1, 3, 1, 5};
        int[][] matrix = {nums1, nums2, nums3};
        setZeroes(matrix);
    }

}
