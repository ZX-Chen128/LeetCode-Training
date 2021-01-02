package Algorithms;

/**
 * 示例 1:
 * <p>
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * 示例 2:
 * <p>
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 */

public class JumpGame {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) return true;

        int max = nums[0];
        for (int i = 0; i <= max; i++) {
            max = Math.max(max, i + nums[i]);
            if (nums[i] + i >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }

}
