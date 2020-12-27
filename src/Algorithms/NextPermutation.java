package Algorithms;

import java.util.Arrays;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/15 9:13 下午
 */

/**
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 * <p>
 * 示例 2：
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 * <p>
 * 示例 3：
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 * <p>
 * 示例 4：
 * 输入：nums = [1]
 * 输出：[1]
 * <p>
 * 示例 5：
 * * 输入：nums = [1,2,7,4,3,1]
 * * 输出：[1,3,1,2,4,7]
 * <p>
 * <p>
 * [1,2,7,3,4,1]
 * <p>
 * [1,2,7,4,1,3]
 * <p>
 * [1,2,7,4,3,1]
 */

public class NextPermutation {

    public void nextPermutation(int[] nums) {

        int indexA = -1;

        int indexB = -1;

        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                indexA = i - 1;
                break;
            }
        }

        if (indexA == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (int i = nums.length - 1; i >= indexA; i--) {
            if (nums[i] > nums[indexA]) {
                indexB = i;
                break;
            }
        }

        swap(nums, indexA, indexB);
        reverse(nums, indexA + 1, nums.length - 1);

    }

    public void swap(int[] nums, int A, int B) {
        int tmp = nums[B];
        nums[B] = nums[A];
        nums[A] = tmp;
    }

    public void reverse(int[] nums, int A, int B) {
        while (A < B) {
            int tmp = nums[B];
            nums[B] = nums[A];
            nums[A] = tmp;
            B--;
            A++;
        }
    }

}
