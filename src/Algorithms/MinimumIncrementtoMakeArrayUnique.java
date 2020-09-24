package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/24 1:34 下午
 */

import java.util.Arrays;

/**
 * 示例 1:
 *
 * 输入：[1,2,2]
 * 输出：1
 * 解释：经过一次 move 操作，数组将变为 [1, 2, 3]。
 * 示例 2:
 *
 * 输入：[3,2,1,2,1,7]
 *      [1,1,2,2,3,7]
 * 输出：6
 * 解释：经过 6 次 move 操作，数组将变为 [3, 4, 1, 2, 5, 7]。
 * 可以看出 5 次或 5 次以下的 move 操作是不能让数组的每个值唯一的。
 */

public class MinimumIncrementtoMakeArrayUnique {

    public static int minIncrementForUnique(int[] A) {
        if(A == null || A.length == 0) return 0;
        Arrays.sort(A);
        int count = 0;
        int pre = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > pre) {
                pre = A[i];
            } else {
                count += pre + 1 - A[i];
                pre++;
            }
        }
        return count;
    }

}
