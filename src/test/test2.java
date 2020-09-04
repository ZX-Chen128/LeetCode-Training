package test;

/**
 * "aaabbaaac"
 *
 *  2
 */

public class test2 {

    public static int GetFragment(String str) {
        int index = 0;
        int count = 0;
        int[] nums = new int[str.length()];

        while (index < str.length()) {
            char standard = str.charAt(index);
            int length = 0;
            while (index != str.length() && str.charAt(index) == standard) {
                length++;
                index++;
            }
            count++;
            nums[count - 1] = length;
            if (length == 1) {
                index++;
            }
        }
        int sumUp = 0;

        for (int i = 0; i < count; i++) {
            sumUp += nums[i];
        }

        return sumUp / count;
    }

    public static void main(String[] args) {
        System.out.println(GetFragment("aaabbaaac"));
    }

}
