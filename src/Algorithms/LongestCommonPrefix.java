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
        if(strs == null || strs.length == 0) return "";
        String common = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int index = 0;
            while(index < common.length()
                    && index < strs[i].length()
                    && common.charAt(index) == strs[i].charAt(index)){
                index++;
            }
            common = common.substring(0,index);
            if(common.equals("")) return "";
        }
        return common;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

}
