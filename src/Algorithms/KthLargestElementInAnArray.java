package Algorithms;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/8 3:11 下午
 */
public class KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i : nums){
            p.add(i);
            if(p.size() > k){
                p.poll();
            }
        }
        return p.peek();
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));
    }

}
