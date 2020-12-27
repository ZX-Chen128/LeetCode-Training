package Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Chen Zixin
 * @Date: 2020/11/30 9:26 下午
 */

/**
 * 例如，给出
 * <p>
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 */

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    private Map<Integer, Integer> hash = new HashMap<>();
    private int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;

        for (int i = 0; i < inorder.length; i++) {
            hash.put(inorder[i], i);
        }

        int preLength = preorder.length;
        int inLength = inorder.length;

        return build(0, preLength - 1, 0, inLength - 1);
    }

    public TreeNode build(int leftPre, int rightPre, int leftIn, int rightIn) {

        if (leftPre > rightPre || leftIn > rightIn) {
            return null;
        }

        int pivot = preorder[leftPre];
        TreeNode node = new TreeNode(pivot);
        int pivotIndex = hash.get(pivot);

        node.left = build(leftPre + 1, pivotIndex - leftIn + leftPre, leftIn, pivotIndex - 1);
        node.right = build(pivotIndex - leftIn + leftPre + 1, rightPre, pivotIndex + 1, rightIn);

        return node;
    }

}
