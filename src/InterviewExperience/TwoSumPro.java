package InterviewExperience;

import test.test;
import java.util.HashMap;
import java.util.Map;

/**
 * 作者：威尼斯的泪H
 * 链接：https://www.nowcoder.com/discuss/420083
 * 来源：牛客网
 *
 * 美团实习手撕代码面经
 *
 * 做题，将一个无序整数序列中两个元素和为100的元素对打印输出到控制台，如输入为8,19,-7,92,26,81,99,107，则输出对应序号（0，3），（1，5），（2，7）。（两数之和的变体），这么简单我做了30min，面试官一边啃面包一边等我，第一次线上写代码，慌得一批。。。
 */


public class TwoSumPro {

    public static void addNum(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(100 - nums[i])) {
                System.out.println("(" + map.get(100 - nums[i]) + "," + i + ")");
            }
            map.put(nums[i], i);
        }
    }

    public static void main(String[] args) {
        TwoSumPro.addNum(new int[]{8, 19, -7, 92, 26, 81, 99, 107});
    }
}
