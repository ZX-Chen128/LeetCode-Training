package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/13 11:00 下午
 */
public class ClimbingStairs {

    public static int climbStairs(int n) {
        int pre = 1;
        int cur = 1;
        int calculate = 1;
        for (int i = 2; i <= n; i++) {
            calculate = pre + cur;
            pre = cur;
            cur = calculate;
        }

        return calculate;
    }

}
