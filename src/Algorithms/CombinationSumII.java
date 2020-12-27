package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/13 11:25 上午
 */

/**
 * 示例 1:
 * <p>
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:[1,1,2,5,6,7,10]
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 * 示例 2:
 * <p>
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:[1,2,2,2,5]
 * [
 *   [1,2,2],
 *   [5]
 * ]
 */

public class CombinationSumII {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] record = new boolean[candidates.length];
        dfs(candidates, 0, new ArrayList<>(), record, target);
        return ans;
    }

    public void dfs(int[] candidates, int depth, List<Integer> list, boolean[] record, int target) {
        if (target < 0) return;
        if (target == 0) ans.add(new ArrayList<>(list));

        for (int i = depth; i < candidates.length; i++) {

            if (target - candidates[i] < 0) break;
            if(record[i]) continue;
            if(i > 0 && candidates[i] == candidates[i - 1] && !record[i - 1]) continue;

            list.add(candidates[i]);
            record[i] = true;
            dfs(candidates, i + 1, list, record, target - candidates[i]);
            list.remove(list.size() - 1);
            record[i] = false;
        }

    }
}
