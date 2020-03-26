package Algorithms;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        int temp = 0;
        while(i+1 != n) {
            if (nums[i] == val) {
                temp = nums[i];
                nums[i] = nums[n - 1];
                nums[n - 1] = temp;
                n--;
            } else {
                i++;
            }
        }

        return n;
    }

}
