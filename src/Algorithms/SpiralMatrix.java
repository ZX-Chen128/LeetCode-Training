package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i <= n / 2 && j <= m / 2) {
            for (int k = i; k < n - i; k++) {
                list.add(matrix[i][k]);
            }

            for (int k = j + 1; k < m - j; k++) {
                list.add(matrix[k][n - i - 1]);
            }

            for (int k = n - i - 2; k >= i; k--) {
                list.add(matrix[m - j - 1][k]);
            }

            for (int k = m - j - 2; k >= j + 1; k--) {
                list.add(matrix[k][i]);
            }
            i++;
            j++;
        }
        while(m*n < list.size()){
            list.remove(m*n);
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[1][3];
        int[] test = {6,9,7};
        matrix1[0] = test;
        List<Integer> list1 = spiralOrder(matrix1);
        for (int i = 0; i < 3; i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("--------------------------");

        int[][] matrix = new int[3][4];
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7, 8};
        int[] nums3 = {9, 10, 11, 12};
        matrix[0] = nums1;
        matrix[1] = nums2;
        matrix[2] = nums3;
        List<Integer> list = spiralOrder(matrix);
        for (int i = 0; i < 12; i++) {
            System.out.println(list.get(i));
        }
    }
}
