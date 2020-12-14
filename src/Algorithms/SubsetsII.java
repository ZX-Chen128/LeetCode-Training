package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/13 6:24 下午
 */

/**
 * 示例:
 * <p>
 * 输入: [1,2,2]
 * 输出:
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
 * [1,2],
 * []
 * ]
 */

public class SubsetsII {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        boolean[] record = new boolean[nums.length];
        for (int i = 0; i <= nums.length; i++) {
            dfs(nums, record, new ArrayList<>(), 0, 0, i);
        }
        return ans;
    }

    public void dfs(int[] nums, boolean[] record, List<Integer> list, int start, int depth, int max) {
        if (depth == max) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < nums.length - max + 1 + list.size(); i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !record[i - 1]) continue;
            record[i] = true;
            list.add(nums[i]);
            dfs(nums, record, list, i + 1, depth + 1, max);
            list.remove(list.size() - 1);
            record[i] = false;
        }
    }

}
