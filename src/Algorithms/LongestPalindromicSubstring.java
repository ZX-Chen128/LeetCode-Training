package Algorithms;

public class LongestPalindromicSubstring {
    /*
    public String longestPalindrome2(String s){

    }
     */

    public String longestPalindrome1(String s) {
        if(s == null || s.length() == 0 ) return "";
        int n = s.length();
        String max ="";
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if ( isPalindrome(s.substring(i, j+1)) && j - i + 1 > max.length() ){
                    max = s.substring(i, j+1);
                }
            }
        }
        return max;
    }

    private boolean isPalindrome(String s){
        String d = new StringBuilder(s).reverse().toString();
        return s.equals(d);
    }

    public static void main(String[] args) {
    }

}
