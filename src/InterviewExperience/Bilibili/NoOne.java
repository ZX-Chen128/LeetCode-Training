package InterviewExperience.Bilibili;

import java.util.Arrays;

/**
 * [1,1,1,0,0,0,1,1,1,1,0],2
 * <p>
 * 6
 * <p>
 * <p>
 * [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1],3
 * <p>
 * 10
 */

public class NoOne {

    public static int GetMaxConsecutiveOnes(int[] arr, int k) {

        int[][] arrays = new int[arr.length][2];
        int i = 0;

        int index = 0;

        int maxLength = 0;

        while (index < arr.length) {
            if (arr[index] == 1) {
                arrays[i][0] = index;
                while (arr[index] == 1) {
                    index++;
                }
                arrays[i][1] = index - 1;
                int length = arrays[i][1] - arrays[i][0] + 1;
                if (length > maxLength) {
                    maxLength = length;
                }
                i++;
            } else {
                while (index != arr.length && arr[index] == 0) {
                    index++;
                }
            }

        }
        int[][] newArrays = Arrays.copyOf(arrays, i);
        int newIndex = 0;
        int maxGap = 0;
        int maxGapIndex = 0;

        while (newIndex != newArrays.length - 1) {
            int gap = newArrays[newIndex + 1][0] - newArrays[newIndex][1];

            if (gap > maxGap) {
                maxGap = gap;
                maxGapIndex = newIndex;
            }

            newIndex++;
        }

        if(k <= maxGap - 1){
            return newArrays[newIndex + 1][1] - newArrays[newIndex][0];
        } else {
            return maxLength;
        }

    }

    public static void main(String[] args) {
        int answer = GetMaxConsecutiveOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 1);
        System.out.println(answer);
    }

}
