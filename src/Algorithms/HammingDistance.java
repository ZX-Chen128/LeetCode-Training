package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/12/5 9:00 下午
 */

/**
 * 示例:
 *
 * 输入: x = 1, y = 4
 *
 * 输出: 2
 *
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 *
 */

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int tmp = x ^= y;
        int count = 0;
        while(tmp != 0){
            count++;
            tmp = tmp & (tmp-1);
        }
        return count;
    }

    /**
     * public int hammingDistance(int x, int y) {
     *         return Integer.bitCount(x ^= y);
     *     }
     */
}
