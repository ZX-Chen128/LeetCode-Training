package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/13 4:24 下午
 */

/**
 * 示例:
 * <p>
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 * [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */

public class Subsets {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        ans.add(new ArrayList<>());

        for (int i = 1; i <= nums.length; i++) {
            dfs(nums, new ArrayList<>(), 0, i);
        }

        return ans;
    }

    public void dfs(int[] nums, List<Integer> list, int depth, int max) {

        if (depth == max) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = depth; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(nums, list, i + 1, max);
            list.remove(list.size() - 1);
        }

    }
}
