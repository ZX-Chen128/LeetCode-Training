package Algorithms;

import java.util.*;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/9 2:22 下午
 */

/**
 * 示例 1：
 * <p>
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 * [7],
 * [2,2,3]
 * ]
 * 示例 2：
 * <p>
 * 输入：candidates = [2,3,5], target = 8,
 * 所求解集为：
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, target, path, ans);

        return ans;
    }

    public void dfs(int[] candidates, int len, int target, Deque<Integer> path, List<List<Integer>> ans) {

        if (target < 0) return;

        if (target == 0) {
            List<Integer> list = new ArrayList<>(path);
            ans.add(list);
        }

        for (int i = len; i < candidates.length; i++) {
            if(target - candidates[i] < 0) {
                break;
            }
            path.add(candidates[i]);

            dfs(candidates, i, target - candidates[i], path, ans);

            path.removeLast();
        }

    }

}
