package test;

import Algorithms.ThreeSumClosest;

import java.util.Arrays;

public class test {

    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int abs = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int p1 = i + 1;
            int p2 = nums.length - 1;
            while (p1 < p2) {
                int sum = nums[i] + nums[p1] + nums[p2];
                if (Math.abs(target - sum) < Math.abs(target - abs)) {
                    abs = sum;
                }
                if (sum > target) {
                    p2--;
                } else if (sum < target) {
                    p1++;
                } else {
                    return target;
                }
            }

        }
        return abs;
    }

    public static void main(String[] args) {
        System.out.println(ThreeSumClosest.threeSumClosest(new int[]{-1,2,1,-4},1));
    }
}
