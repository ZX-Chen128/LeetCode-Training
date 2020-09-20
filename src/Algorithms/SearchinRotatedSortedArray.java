package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/8 4:57 下午
 */
public class SearchinRotatedSortedArray {
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;

        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target <= nums[end] && target > nums[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{3, 1}, 1));
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(search(new int[]{1, 3}, 3));
        System.out.println(search(new int[]{6, 7, 0, 1, 3, 4, 5}, 0));
        System.out.println(search(new int[]{3, 4, 5, 6, 7, 0, 1}, 0));
    }

}
