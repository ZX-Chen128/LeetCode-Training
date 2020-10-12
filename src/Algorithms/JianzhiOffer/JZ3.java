package Algorithms.JianzhiOffer;

/**
 * @Author: Chen Zixin
 * @Date: 2020/10/11 4:59 下午
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 找出数组中重复的数字。
 * <p>
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个
 * 数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */

public class JZ3 {
    public static int findRepeatNumber(int[] nums) {
        int tmp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[nums[i]] == nums[i]) {
                    return nums[i];
                }
                tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
    }
}
