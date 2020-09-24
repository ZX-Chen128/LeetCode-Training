package Algorithms;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if(s.length() <= 1) {
            return s;
        }

        int len = s.length();

        boolean[][] dp = new boolean[len][len];
        char[] array = s.toCharArray();
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        int max = 1;
        int index = 0;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] != array[i]) {
                    dp[j][i] = false;
                } else {
                    if (i - j <= 2) {
                        dp[j][i] = true;
                    } else {
                        dp[j][i] = dp[j + 1][i - 1];
                    }
                }
                if (dp[j][i] && i - j + 1 > max) {
                    max = i - j + 1;
                    index = j;
                }
            }
        }
        return s.substring(index, max + index);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("abcbiilmnnmliksl"));
    }

}
