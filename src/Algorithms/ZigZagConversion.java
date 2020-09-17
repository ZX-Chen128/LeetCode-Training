package Algorithms;

/**
 *
 * 示例 1:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 *
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 *
 *
 */

public class ZigZagConversion {

    public static String convert(String s, int numRows) {

        if(s == null || s.length() == 0 || numRows == 1) return s;
        int x = 0;
        int cur = 1;

        StringBuilder[] array = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) array[i] = new StringBuilder();
        for(Character c : s.toCharArray()){
            array[x].append(c);
            x += cur;
            if(x==0||x==numRows-1){
                cur = -cur;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int j = 0; j < array.length; j++){
            result.append(array[j]);
        }

        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(convert("LEETCODEISHIRING", 3));
        System.out.println(convert("LEETCODEISHIRING", 4));
    }

}
