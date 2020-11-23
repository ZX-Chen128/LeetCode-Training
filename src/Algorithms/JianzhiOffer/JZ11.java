package Algorithms.JianzhiOffer;

/**
 * @Author: Chen Zixin
 * @Date: 2020/10/13 1:37 下午
 */

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，
 * 输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[3,4,5,1,2]
 * 输出：1
 * <p>
 * 示例 2：
 * <p>
 * 输入：[2,2,2,0,1,2]
 * 输出：0
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：[5,1,2,3,4]
 * 输出：1
 */

public class JZ11 {
    public static int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        System.out.println(minArray(new int[]{1, 3, 5}));
        System.out.println(minArray(new int[]{3, 4, 5, 1, 2}));
        System.out.println(minArray(new int[]{2, 2, 2, 0, 1, 2}));
    }
}
