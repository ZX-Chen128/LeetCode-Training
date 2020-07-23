package test;

import java.util.*;

/*
示例 1:

给定数组 nums = [1,1,2],

函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。

你不需要考虑数组中超出新长度后面的元素。
示例 2:

给定 nums = [0,0,1,1,1,2,2,3,3,4],

函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

你不需要考虑数组中超出新长度后面的元素。
 */

public class test {

    public static int removeDuplicates(int[] nums) {
        int fast = 1;
        int slow = 1;
        for(;fast<nums.length;fast++){
            if(nums[fast]!=nums[fast-1]){
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] s1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i1 = test.removeDuplicates(s1);
        for (int i = 0; i < i1; i++) {
            System.out.println(s1[i]);
        }
    }

}
