package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/9 5:30 下午
 */

import java.util.Arrays;

/**
 * 示例 1:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 */

public class FindFirstandLastPositionofElementinSortedArray {

    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int first = findFirstIndex(nums, target);
        if (first == -1) {
            return new int[]{-1, -1};
        }

        int last = findLastIndex(nums, target);

        return new int[]{first, last};
    }

    public static int findFirstIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int mid;

        while(start <= end){
            mid = (start + end) / 2;

            if(nums[mid] == target){
                end = mid - 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if(start != nums.length && nums[start] == target){
            return start;
        }
        return -1;
    }

    // 找最末索引 即是字节面试所考察
    public static int findLastIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int mid;

        while(start <= end) {
            mid = (start + end) / 2;

            if(nums[mid] == target){
                start = mid + 1;
            } else if(nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{2, 2}, 3)));
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7)));
    }

}
