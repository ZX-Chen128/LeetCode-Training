package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/15 1:31 下午
 */

/**
 * 示例:
 * <p>
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 */

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int depth = nums.length;
        boolean[] record = new boolean[depth];

        // 传入所有dfs结果 每次的dfs数据 每个位置的记录 目前深度 最大深度
        dfs(lists, nums, new ArrayList<>(), record, 0, depth);

        return lists;
    }

    public void dfs(List<List<Integer>> lists,
                    int[] nums,
                    List<Integer> list,
                    boolean[] record,
                    int n,
                    int depth) {
        if (n == depth) {
            lists.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < depth; i++) {
            if (!record[i]) {
                list.add(nums[i]);
                record[i] = true;
                dfs(lists, nums, list, record, n + 1, depth);
                record[i] = false;
                list.remove(list.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        Permutations p = new Permutations();
        System.out.println(p.permute(new int[]{1, 2, 3, 4}));
    }
}
