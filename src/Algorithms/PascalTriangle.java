package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/13 3:58 下午
 */

/**
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        if(numRows == 0){
            return new ArrayList<>();
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        List<Integer> preList;
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            preList = lists.get(i - 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(preList.get(j) + preList.get(j - 1));
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}

