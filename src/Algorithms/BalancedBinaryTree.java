package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/16 6:06 下午
 */

/**
 * 示例 1:
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7]
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回 true 。
 * <p>
 * 示例 2:
 * <p>
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 * <p>
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 * 返回 false 。
 */

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return recurse(root) != -1;
    }

    public int recurse(TreeNode root) {
        if (root == null) return 0;

        int left = recurse(root.left);
        if (left == -1) return -1;

        int right = recurse(root.right);
        if (right == -1) return -1;

        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

}
