package test;

import java.util.Arrays;

public class test {

    //冒泡排序

    public static void BubbleSort(int[] nums){
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if(nums[j] > nums[j+1]){
                    int tem = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tem;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int[] nums1 = {5,5,5,1,1,1};
        int[] nums2 = {-1,-2,-3,-4,-5};
        int[] nums3 = {};
        int[] nums4 = {Integer.MAX_VALUE,Integer.MIN_VALUE};
        BubbleSort(nums4);
        System.out.println(Arrays.toString(nums4));
    }
}
