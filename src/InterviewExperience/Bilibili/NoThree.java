package InterviewExperience.Bilibili;

import java.util.Arrays;

/**
 * [[1, 2, 3, 4], [5, 6, 7, 8], [9,10,11,12] ]
 * <p>
 * [1,2,3,4,8,12,11,10,9,5,6,7]
 */

public class NoThree {

    public static int[] SpiralMatrix(int[][] matrix) {

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
        int[][] arrays = new int[3][4];
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int[] array3 = {9, 10, 11, 12};
        arrays[0] = array1;
        arrays[1] = array2;
        arrays[2] = array3;

        System.out.println(Arrays.toString(SpiralMatrix(arrays)));
    }

}
