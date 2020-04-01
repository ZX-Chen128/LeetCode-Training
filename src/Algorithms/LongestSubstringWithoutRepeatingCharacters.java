package Algorithms;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(i < s.length() && j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j-i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcdbcbb"));
    }

}
