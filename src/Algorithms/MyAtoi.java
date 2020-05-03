package Algorithms;

/**
 * 示例 1:
 * <p>
 * 输入: "42"
 * 输出: 42
 * 示例 2:
 * <p>
 * 输入: "   -42"
 * 输出: -42
 * 解释: 第一个非空白字符为 '-', 它是一个负号。
 *      我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
 * 示例 3:
 * <p>
 * 输入: "4193 with words"
 * 输出: 4193
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 * 示例 4:
 * <p>
 * 输入: "words and 987"
 * 输出: 0
 * 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
 * 因此无法执行有效的转换。
 * 示例 5:
 * <p>
 * 输入: "-91283472332"
 * 输出: -2147483648
 * 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
 *      因此返回 INT_MIN (−231) 。
 */

public class MyAtoi {
    public static int myAtoi(String str) {
        str = str.trim();
        if(str.length()==0) return 0;
        if (!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-' && str.charAt(0) != '+') {
            return 0;
        }
        boolean neg = str.charAt(0) == '-';
        int i = Character.isDigit(str.charAt(0)) ? 0 : 1;
        long ans = 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            ans = ans * 10 + str.charAt(i) - '0';
            if (!neg && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (neg && ans > Integer.MAX_VALUE + 1L) {
                return (int) (Integer.MAX_VALUE + 1L);
            }
            i++;
        }
        return neg ? (int) -ans : (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(MyAtoi.myAtoi(""));
    }
}
