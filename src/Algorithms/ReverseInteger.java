package Algorithms;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 */

public class ReverseInteger {
    public static int reverse(int x) {
        if (x == Integer.MIN_VALUE) return 0;
        int neg = x < 0 ? -1 : 1;
        x *= neg;
        int temp = 0;
        while (x > 0) {
            int n = temp;
            temp *= 10;
            temp += x % 10;
            x /= 10;
            if (temp / 10 != n) return 0;
        }
        return temp * neg;
    }

    public static void main(String[] args) {
        System.out.println((int) Math.pow(2, 29) + " " + reverse((int) Math.pow(2, 29)));
    }
}