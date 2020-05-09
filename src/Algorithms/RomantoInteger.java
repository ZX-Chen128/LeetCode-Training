package Algorithms;

/**
 * 输入: "III"
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: "IV"
 * 输出: 4
 * 示例 3:
 * <p>
 * 输入: "IX"
 * 输出: 9
 * 示例 4:
 * <p>
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * 示例 5:
 * <p>
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */

public class RomantoInteger {

    public static int romanToInt(String s) {
        int sum = 0;
        int prenum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int chosen = getValue(s.charAt(i));
            if (prenum < chosen) {
                sum -= prenum;
            } else {
                sum += prenum;
            }
            prenum = chosen;
        }
        sum += prenum;

        return sum;
    }

    public static int getValue(Character ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(RomantoInteger.romanToInt("MCMXCIV"));
    }

}
