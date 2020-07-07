package test;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int leftIndex, int rightIndex){
        if(leftIndex >= rightIndex){
            return;
        }

        int left = leftIndex;
        int right = rightIndex;

        int key = arr[left];

        while(left < right){

        }

    }

}
