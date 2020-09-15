package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/15 3:26 下午
 */

/**
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 *
 */

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lists = new ArrayList<>();
        dfs(root, lists);
        return lists;
    }

    public void dfs(TreeNode root, List<Integer> lists) {
        if (root == null) {
            return;
        }
        lists.add(root.val);
        dfs(root.left, lists);
        dfs(root.right, lists);
    }

}
