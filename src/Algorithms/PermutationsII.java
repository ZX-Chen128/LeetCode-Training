package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/12 9:23 下午
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,2]
 * 输出：
 * [[1,1,2],
 * [1,2,1],
 * [2,1,1]]
 * 示例 2：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class PermutationsII {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] record = new boolean[nums.length];
        dfs(nums, record, new ArrayList<>(), 0, nums.length);
        return ans;
    }

    public void dfs(int[] nums, boolean[] record, List<Integer> list, int n, int depth) {
        if (n == depth) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1] && !record[i - 1]) {
                continue;
            }
            if (!record[i]) {
                record[i] = true;
                list.add(nums[i]);
                dfs(nums, record, list, list.size(), depth);
                list.remove(n);
                record[i] = false;
            }
        }
    }

}
