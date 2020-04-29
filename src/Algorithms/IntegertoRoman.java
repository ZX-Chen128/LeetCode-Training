package Algorithms;

/**
 *     public String intToRoman(int num) {
 *         int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
 *         String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
 *         StringBuilder sb = new StringBuilder();
 *         int index = 0;
 *         while(index < 13){
 *             while(num >= nums[index]){
 *                 sb.append(romans[index]);
 *                 num -= nums[index];
 *             }
 *             index++;
 *         }
 *
 *         return sb.toString();
 *
 *     }
 */

public class IntegertoRoman {

    public String intToRoman(int num) {
        String[] strs = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] nums = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int length = 12;
        StringBuilder s = new StringBuilder(0);
        while (num > 0) {
            if (num >= nums[length]) {
                num -= nums[length];
                s.append(strs[length]);
            } else {
                length--;
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        IntegertoRoman i = new IntegertoRoman();
        System.out.println(i.intToRoman(1994));
    }

}
