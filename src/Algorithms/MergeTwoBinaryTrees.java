package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/5 9:50 下午
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1, t2);
    }

    public TreeNode merge(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;

        int val1 = t1 == null ? 0 : t1.val;
        int val2 = t2 == null ? 0 : t2.val;

        TreeNode t1Left = t1 == null ? null : t1.left;
        TreeNode t2Left = t2 == null ? null : t2.left;

        TreeNode t1Right = t1 == null ? null : t1.right;
        TreeNode t2Right = t2 == null ? null : t2.right;

        TreeNode node = new TreeNode(val1 + val2);
        node.left = merge(t1Left, t2Left);
        node.right = merge(t1Right, t2Right);

        return node;
    }
}
