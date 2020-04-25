package Algorithms;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = j-i;
        int n = s.length();
        for (; j < n; j++) {
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            map.put(s.charAt(j),j+1);
            ans = Math.max(j-i+1,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcdbcbb"));
    }

}
