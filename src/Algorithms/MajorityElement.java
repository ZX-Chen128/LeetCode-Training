package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/3 11:49 下午
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */

public class MajorityElement {

    // 摩尔投票法
    public int majorityElement(int[] nums) {
        int pivot = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(pivot == nums[i]) {
                count++;
            } else {
                count--;
            }
            if(count == 0) {
                pivot = nums[i];
                count = 1;
            }
        }
        return pivot;
    }

}
