package Algorithms;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int abs = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int head = i + 1;
            int back = nums.length - 1;
            while(head < back){
                int sum = nums[i] + nums[head] + nums[back];
                if(Math.abs(target - abs) > Math.abs(target - sum)){
                    abs = sum;
                }
                if(sum > target){
                    back--;
                } else if(sum < target){
                    head++;
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

