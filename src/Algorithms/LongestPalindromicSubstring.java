package Algorithms;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n + 1][n + 1];
        String max = "";
        for (int j = 0; j < n + 1; j++) {
            for (int i = j; i >= 0; i--) {
                if (i == j || i + 1 == j) {
                    isPalindrome[i][j] = true;
                } else if (s.charAt(i) == s.charAt(j - 1) && isPalindrome[i + 1][j - 1]) {
                    isPalindrome[i][j] = true;
                }

                if (i != j && isPalindrome[i][j] && max.length() < j - i) {
                    max = s.substring(i, j);
                }
            }
        }
        return max;
    }

    public String longestPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int n = s.length();
        String max = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrom(s.substring(i, j + 1)) && j - i + 1 > max.length()) {
                    max = s.substring(i, j + 1);
                }
            }
        }
        return max;
    }

    public boolean isPalindrom(String s) {
        String x = new StringBuilder(s).reverse().toString();
        return x.equals(s);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        System.out.println(l.longestPalindrome("abcbii"));
    }

}
