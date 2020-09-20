package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/15 3:35 下午
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lists = new ArrayList<>();
        dfs(root, lists);
        return lists;
    }

    public void dfs(TreeNode root, List<Integer> lists) {
        if (root == null) {
            return;
        }
        dfs(root.left, lists);
        dfs(root.right, lists);
        lists.add(root.val);
    }

}
