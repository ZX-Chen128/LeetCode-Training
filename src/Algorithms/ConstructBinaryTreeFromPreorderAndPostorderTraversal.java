package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/1 3:58 下午
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 示例：
 * <p>
 * 输入：pre = [1,2,4,5,3,6,7], post = [4,5,2,6,7,3,1]
 * 输出：[1,2,3,4,5,6,7]
 */

//pivotIndex - postPre +

//0 6 0 6
//1 3 0 2
//4 6 3 5

//

public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {

    private Map<Integer, Integer> hash = new HashMap<>();
    private int[] preOrder;

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        this.preOrder = pre;

        for (int i = 0; i < post.length; i++) {
            hash.put(post[i], i);
        }

        int rightPre = pre.length;
        int rightPost = post.length;

        return build(0, rightPre - 1, 0, rightPost - 1);
    }

    public TreeNode build(int leftPre, int rightPre, int leftPost, int rightPost) {
        System.out.println(leftPre + " " + rightPre + " " + leftPost + " " + rightPost);

        if (leftPre > rightPre || leftPost > rightPost) {
            return null;
        }

        int num = preOrder[leftPre];
        TreeNode node = new TreeNode(num);

        if(leftPre == rightPre && leftPost == rightPost) {
            node.left = null;
            node.right = null;
            return node;
        }

        int pivot = preOrder[leftPre + 1];
        int pivotIndex = hash.get(pivot);

        node.left = build(leftPre + 1, leftPre + 1 + pivotIndex - leftPost, leftPost, pivotIndex);
        node.right = build(leftPre + 2 + pivotIndex - leftPost, rightPre, pivotIndex + 1, rightPost - 1);

        return node;
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromPreorderAndPostorderTraversal c = new ConstructBinaryTreeFromPreorderAndPostorderTraversal();
        c.constructFromPrePost(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 5, 2, 6, 7, 3, 1});
    }
}
