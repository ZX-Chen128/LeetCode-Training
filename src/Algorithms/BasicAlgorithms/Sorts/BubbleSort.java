package Algorithms.BasicAlgorithms.Sorts;

import java.util.Arrays;

/**
 * 平均时间复杂度：O(N^2)
 * 最好时间复杂度：O(N)
 * 最坏时间复杂度：O(N^2)
 * 空间复杂度：O(1)
 */

public class BubbleSort {

    public int[] bubbleSort(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        System.out.println(Arrays.toString(b.bubbleSort(new int[]{5,4,3,2,1})));
    }
}
