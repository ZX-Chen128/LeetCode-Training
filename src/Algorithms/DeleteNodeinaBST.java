package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/11 5:31 下午
 */

/**
 * 示例:
 * <p>
 * root = [5,3,6,2,4,null,7]
 * key = 3
 * <p>
 * 5
 * / \
 * 3   6
 * / \   \
 * 2   4   7
 * <p>
 * 给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
 * <p>
 * 一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
 * <p>
 * 5
 * / \
 * 4   6
 * /     \
 * 2       7
 * <p>
 * 另一个正确答案是 [5,2,6,null,4,null,7]。
 * <p>
 * 5
 * / \
 * 2   6
 * \   \
 * 4   7
 */

public class DeleteNodeinaBST {

    public static TreeNode deleteNode(TreeNode root, int key) {
        // 遇到了测试用例的补充 二叉树里不存在就啥也不做
        if(root == null){
            return root;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }

        // 有一边是null就直接返回另一边
        if(root.right == null){
            return root.left;
        }
        if(root.left == null){
            return root.right;
        }

        // 我选择了左子树升
        TreeNode target = root.left;

        // 找右子树的位置
        while(target.right != null){
            target = target.right;
        }
        target.right = root.right;

        return root.left;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(6);
        root.left = left1;
        root.right = right1;

        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(4);
        left1.left = left2;
        left1.right = right2;

        TreeNode right3 = new TreeNode(7);
        right1.right = right3;

        deleteNode(root,0);
    }

}
