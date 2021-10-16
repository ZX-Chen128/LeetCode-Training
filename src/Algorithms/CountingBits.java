package Algorithms;

import java.util.Arrays;

/**
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：[0,1,1]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 示例 2：
 *
 * 输入：n = 5
 * 输出：[0,1,1,2,1,2]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 *
 *
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 * 6 110
 * 7 111
 * 8 1000
 * 9 1001
 * 10 1010
 * 11 1011
 * 12 1100
 * 13 1101
 * 14 1110
 * 15 1111
 * 16 10000
 */

public class CountingBits {

    public static int[] countBits(int n) {
        int[] nums = new int[n + 1];

        nums[0] = 0;

        if(n + 1 >= 2) {
            nums[1] = 1;
        }

        if(n + 1 >= 3) {
            nums[2] = 1;
        }

        if(n + 1 >= 4) {
            nums[3] = 2;
        }

        if(n + 1 >= 5) {
            int flag = 8;
            for (int i = 4; i <= n; i++) {
                if(i >= flag) {
                    flag *= 2;
                }
                nums[i] = 1 + nums[i - flag / 2];
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(9)));
    }

}
