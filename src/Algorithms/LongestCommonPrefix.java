package Algorithms;

/**
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null) {
            return "";
        }

        String prefix = strs[0];

        for (String s : strs) {
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;

    }

    public static void main(String[] args) {
        System.out.println(LongestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

}
