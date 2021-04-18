package InterviewExperience;

import java.util.Scanner;

/**
 * input:
 * 5 3
 * 2 5
 * 1 3
 * 2 5
 *
 * output:
 * 5
 *
 */

public class AntCode1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = i + 1;
        }

        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            int left = sc.nextInt() - 1;
            int right = sc.nextInt() - 1;
            while(left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }

        int count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if(nums[i] > nums[j]) count++;
            }
        }

        System.out.println(count);

    }

}
