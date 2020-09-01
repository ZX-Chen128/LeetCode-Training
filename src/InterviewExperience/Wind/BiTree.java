package InterviewExperience.Wind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BiTree {

    public List<List<Integer>> count(TreeNode root, int K){
        List<List<Integer>> answer = new ArrayList<>();
        helper(answer,root,K);
        System.out.println(answer);
        return answer;
    }

    public void helper(List<List<Integer>> answer,TreeNode root, int K){
        if(root!=null){
            ArrayList<Integer> addin = new ArrayList<>();
            addin.add(root.val);
        }
    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
        left=null;
        right=null;
    }
}
