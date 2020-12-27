package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/1 11:16 上午
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 中序遍历 inorder = [9,3,15,20,7]
 * 后序遍历 postorder = [9,15,7,20,3]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 */

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    private int[] postorder;
    private Map<Integer, Integer> hash = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;

        for (int i = 0; i < inorder.length; i++) {
            this.hash.put(inorder[i], i);
        }

        int rightIn = inorder.length;
        int rightPost = postorder.length;

        return build(0, rightIn - 1, 0, rightPost - 1);
    }

    public TreeNode build(int leftIn, int rightIn, int leftPost, int rightPost) {
        if (leftIn > rightIn || leftPost > rightPost) {
            return null;
        }
        int pivot = postorder[rightPost];
        TreeNode node = new TreeNode(pivot);

        int pivotIndex = hash.get(pivot);

        node.right = build(pivotIndex + 1, rightIn, rightPost - rightIn + pivotIndex, rightPost - 1);
        node.left = build(leftIn, pivotIndex - 1, leftPost, rightPost - rightIn + pivotIndex - 1);
        return node;
    }
}
