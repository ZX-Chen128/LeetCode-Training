package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * 示例：
 * <p>
 * 输入：n = 3
 * 输出：[
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> lists = new ArrayList<>();
        if (n == 0) return lists;
        dfs("", 0, 0, n, lists);

        return lists;
    }

    public static void dfs(String str, int left, int right, int n, List<String> lists) {
        if (left < right) {
            return;
        }
        if (left == n && right == n) {
            lists.add(str);
            return;
        }
        if (left < n) {
            dfs(str + "(", left + 1, right, n, lists);
        }
        if (right < n) {
            dfs(str + ")", left, right + 1, n, lists);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
