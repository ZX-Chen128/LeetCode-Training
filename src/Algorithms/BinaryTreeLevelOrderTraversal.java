package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/15 3:39 下午
 */

/**
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 */

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        dfs(root, res, 1);
        return res;
    }

    public void dfs(TreeNode root, List<List<Integer>> res, int depth){
        if(root == null) return;
        if(res.size() < depth){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            res.add(list);
        } else {
            res.get(depth - 1).add(root.val);
        }

        dfs(root.left, res, depth+1);
        dfs(root.right, res, depth+1);

    }
}
