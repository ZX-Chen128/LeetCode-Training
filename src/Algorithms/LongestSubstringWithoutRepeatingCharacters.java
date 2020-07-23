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
        int end = 0;
        int start = 0;
        int ans = 0;
        for (; end < s.length(); end++) {
            if(map.containsKey(s.charAt(end))){
                start = Math.max(start,map.get(s.charAt(end)));//有时此字符出现过，但是并不在当前的滑动窗口中，需要过滤，所以这里并不是start = map.get(s.charAt(end))
            }
            map.put(s.charAt(end),end+1);
            ans = Math.max(ans,end-start+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcdbcbb"));
    }

}
