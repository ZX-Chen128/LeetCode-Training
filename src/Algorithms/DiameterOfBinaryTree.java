package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/5 11:51 下午
 */

/**
 * 示例 :
 * 给定二叉树
 *
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 *
 */

public class DiameterOfBinaryTree {

    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dig(root);
        return ans;
    }

    public int dig(TreeNode root) {
        if (root == null) return 0;

        int L = dig(root.left);
        int R = dig(root.right);

        ans = Math.max(ans, L + R);

        return Math.max(L, R) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        root.left = l;
        root.right = r;

        TreeNode ll = new TreeNode(4);
        TreeNode lr = new TreeNode(5);
        l.left = ll;
        l.right = lr;

        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();

        tree.diameterOfBinaryTree(root);
    }
}
