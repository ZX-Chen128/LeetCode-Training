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

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, 0, new ArrayList<>(), target);
        return ans;
    }

    public void dfs(int[] candidates,int depth, List<Integer> list, int target) {
        if (target < 0) return;
        if (target == 0) ans.add(new ArrayList<>(list));

        for (int i = depth; i < candidates.length; i++) {
            if(target - candidates[i] < 0) {
                break;
            }
            list.add(candidates[i]);
            dfs(candidates, i, list, target - candidates[i]);
            list.remove(list.size() - 1);
        }
    }

}
