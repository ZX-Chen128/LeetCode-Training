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

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] record = new boolean[nums.length];
        dfs(nums, new ArrayList<>(), record, 0, nums.length);

        return ans;
    }

    public void dfs(int[] nums,
                    List<Integer> list,
                    boolean[] record,
                    int n,
                    int depth) {
        if(n == depth) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!record[i]) {
                record[i] = true;
                list.add(nums[i]);
                dfs(nums, list, record, list.size(), nums.length);
                list.remove(n);
                record[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Permutations p = new Permutations();
        System.out.println(p.permute(new int[]{1, 2, 3}));
    }
}

