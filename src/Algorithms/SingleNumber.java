package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/3 6:33 下午
 */

/**
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
