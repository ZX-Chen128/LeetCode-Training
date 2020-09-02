package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/2 2:06 下午
 */

import java.util.Arrays;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 * <p>
 * 示例 1:
 * <p>
 * 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 * <p>
 * 输入: intervals = [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * 注意：输入类型已于2019年4月15日更改。 请重置默认代码定义以获取新方法签名。
 * <p>
 * 示例 3:
 * <p>
 * 输入：
 * [[1,4],[5,6]]
 * 输出：
 * [[1,6]]
 * 预期结果：
 * [[1,4],[5,6]]
 * <p>
 * <p>
 * 提示：
 * <p>
 * intervals[i][0] <= intervals[i][1]
 */

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] answer = new int[intervals.length][2];
        int index = -1;
        for (int[] res : intervals) {
            if (index == -1 || answer[index][1] < res[0]) {
                answer[++index] = res;
            } else {
                answer[index][1] = Math.max(res[1], answer[index][1]);
            }
        }
        return Arrays.copyOf(answer, index + 1);
    }

    public static void main(String[] args) {
        int[][] typeIn = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] receive = MergeIntervals.merge(typeIn);
        System.out.println();
        for (int i = 0; i < receive.length; i++) {
            System.out.println(Arrays.toString(receive[i]));
        }
    }

}
