package Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target){

        if(nums==null){return null;}

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length ; i++) {
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            } else {
                return new int[]{map.get(target-nums[i]),i};
            }
        }

        return null;
    }

}
