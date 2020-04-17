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
        StringBuffer str = new StringBuffer();
        int[] nums = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] strs = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int index = 12;
        while(num>=1){
            if(num>=nums[index]){
                str.append(strs[index]);
                num -= nums[index];
            } else {
                index--;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        IntegertoRoman i = new IntegertoRoman();
        System.out.println(i.intToRoman(1994));
    }

}
