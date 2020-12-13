package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/13 2:24 下午
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 示例:
 * <p>
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */

public class Combinations {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, new ArrayList<>(), 0, k);
        return ans;
    }

    public void dfs(int startNum, int endNum, List<Integer> list, int depth, int k) {
        if (depth == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = startNum; i <= endNum - (k - list.size()) + 1; i++) {
            list.add(i);
            dfs(i + 1, endNum, list, depth + 1, k);
            list.remove(list.size() - 1);
        }
    }

}
