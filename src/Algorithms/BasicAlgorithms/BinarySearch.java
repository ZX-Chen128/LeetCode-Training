package Algorithms.BasicAlgorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/9 9:54 上午
 */
public class BinarySearch {

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;

        int mid;

        while (start <= end) {
            //mid = start + (end - start) / 2;
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 3}, 3));
        System.out.println(search(new int[]{0, 1, 2, 4, 5, 6, 7}, 0));
        System.out.println(search(new int[]{0, 1, 2, 4, 5, 6, 7}, 4));
        System.out.println(search(new int[]{0, 1, 2, 4, 5, 6, 7}, 7));
        System.out.println(search(new int[]{1, 3, 4, 5, 6, 7}, 0));
    }

}
