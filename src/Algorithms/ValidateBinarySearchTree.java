package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/11 5:02 下午
 */

/**
 * 示例 1:
 *
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 * 示例 2:
 *
 * 输入:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 *
 */

public class ValidateBinarySearchTree {

    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }

        if(!isValidBST(root.left)){
            return false;
        }

        if(root.val <= pre){
            return false;
        }

        pre = root.val;

        return isValidBST(root.right);

    }

}
