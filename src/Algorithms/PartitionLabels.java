package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/22 2:45 下午
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 示例 1：
 * <p>
 * 输入：S = "ababcbacadefegdehijhklij"
 * 输出：[9,7,8]
 * 解释：
 * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 * 每个字母最多出现在一个片段中。
 * 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 */

public class PartitionLabels {
    public static List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        int index = 0;
        int anchor = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            int tmp = S.charAt(i) - 'a';
            index = Math.max(index, last[tmp]);
            if(i == index){
                list.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
}
