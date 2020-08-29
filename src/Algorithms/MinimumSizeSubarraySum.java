package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/8/29 5:55 下午
 */

import java.util.Arrays;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s
 * 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 *  
 * <p>
 * 进阶：
 * <p>
 * 如果你已经完成了 O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 */

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int s, int[] nums) {
        int low = 0;
        int high = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while (high < nums.length) {
            sum += nums[high++];
            while (sum >= s) {
                min = Math.min(min, high - low);
                sum -= nums[low++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        System.out.println(MinimumSizeSubarraySum.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

}
