package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/11 7:57 下午
 */

/**
 * 例如, 
 *
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * 和 插入的值: 5
 * 你可以返回这个二叉搜索树:
 *
 *          4
 *        /   \
 *       2     7
 *      / \   /
 *     1   3 5
 * 或者这个树也是有效的:
 *
 *          5
 *        /   \
 *       2     7
 *      / \
 *     1   3
 *          \
 *           4
 *
 */

public class InsertintoaBinarySearchTree {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(val > root.val){
            root.right = insertIntoBST(root.right, val);
        } else if(val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

}
