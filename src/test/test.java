package test;

import java.util.Arrays;

/**
 * [[1, 2, 3, 4], [5, 6, 7, 8], [9,10,11,12] ]
 *
 * [1,2,3,4,8,12,11,10,9,5,6,7]
 */

public class test {

    public int[] SpiralMatrix(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return null;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] array = new int[m * n];
        int i = 0;
        int index = 0;

        int count = (Math.min(m, n) + 1) / 2;

        while (i < count) {
            for (int j = i; j < n - i; j++) {
                array[index++] = matrix[i][j];
            }
            for (int j = i + 1; j < m - i; j++) {
                array[index++] = matrix[j][(n - 1) - i];
            }
            for (int j = (n - 1) - (i + 1); j >= i && (m - 1 - i != i); j--) {
                array[index++] = matrix[(m - 1) - i][j];
            }
            for (int j = (m - 1) - (i + 1); j >= i + 1 && (n - 1 - i != i); j--) {
                array[index++] = matrix[j][i];
            }
            i++;
        }
        return array;

    }

    public static void main(String[] args) {
        int[] sum = new int[10];
        System.out.println(Arrays.toString(sum));
    }
}
