package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/5 8:15 下午
 */

/**
 * 示例:
 *
 * 输入:
 * [4,3,2,7,8,2,3,1]
 *
 * 7,3,2,4,8,2,3,1
 *
 *
 *
 * 输出:
 * [5,6]
 */

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
