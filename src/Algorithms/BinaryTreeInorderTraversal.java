package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/11 4:37 下午
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,3,2]
 *
 */

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lists = new ArrayList<>();
        dfs(root, lists);
        return lists;
    }

    public void dfs(TreeNode root, List<Integer> lists) {
        if (root == null) {
            return;
        }
        dfs(root.left, lists);
        lists.add(root.val);
        dfs(root.right, lists);
    }

}
