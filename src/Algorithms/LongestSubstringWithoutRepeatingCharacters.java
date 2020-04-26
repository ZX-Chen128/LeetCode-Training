package Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 */

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        for (; j < s.length(); j++) {
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j)));
            }
            map.put(s.charAt(j),j+1);
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcdbcbb"));
    }

}
