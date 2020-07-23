package Algorithms;

public class RemoveDuplicatesfromSortedArray {

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

}
