package Algorithms.Daily.WeekOne.PartTwo;

import java.util.Scanner;

//拼多多2020春

/**
 * 给定一个数组，每个元素范围是0~K（K < 整数最大值2^32），将该数组分成两部分，使得 |S1- S2|最小，其中S1和S2分别是数组两部分的元素之和。
 */

public class Main1 {

        private static long minDiff = Integer.MAX_VALUE;

        private static void solve(int[] nums, int l, long diff) {
            if (l == nums.length - 1) {
                long minAbsDiff = Math.min(diff, Math.abs(diff - 2 * nums[l]));
                minDiff = Math.min(minDiff, minAbsDiff);
                return;
            }

            solve(nums, l + 1, diff);
            solve(nums, l + 1, Math.abs(diff - 2 * nums[l]));

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];

            long sum = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                sum += nums[i];
            }

            long diff = sum;

            solve(nums, 0, diff);

            System.out.println(minDiff);

        }

}
