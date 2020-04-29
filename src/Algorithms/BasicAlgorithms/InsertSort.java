package Algorithms.BasicAlgorithms;

import java.util.Arrays;

public class InsertSort {

    public int[] insertSort(int[] nums) {
        int i,j;
        int length = nums.length;
        for (i = 1; i < length; i++) {
            int temp = nums[i];
            for (j = i - 1; j >= 0; j--) {
                if (temp > nums[j]) {
                    break;
                } else {
                    nums[j+1] = nums[j];
                }
            }
            nums[j+1] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        InsertSort is = new InsertSort();
        System.out.println(Arrays.toString(is.insertSort(new int[]{5,4,3,2,1})));
    }

}
