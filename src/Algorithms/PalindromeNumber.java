package Algorithms;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int real = x;
        if (x == Integer.MIN_VALUE) return false;
        if (x < 0) return false;
        int ret = 0;
        while(x > 0){
            int n = ret;
            n *= 10;
            n += x%10;
            x /= 10;
            if( n/10 != ret) return false;
            ret = n;
        }
        if (ret == real){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(121));
    }

}
