package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/10 3:08 下午
 */

import java.util.*;

/**
 * 示例 1:
 * <p>
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 * <p>
 * 输入: nums = [1], k = 1
 * 输出: [1]
 */

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // int[] 的第一个元素代表数组的值，第二个元素代表了该值出现的次数
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((m, n) -> m[1] - n[1]);

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            int key = entry.getKey();
            int count = entry.getValue();
            if(queue.size() == k) {
                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.add(new int[]{key, count});
                }
            } else {
                queue.add(new int[]{key, count});
            }
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{3, 1, 1, 1, 2, 2}, 2)));
    }

}
