package Algorithms.Daily.WeekTwo.PartOne;

//平安科技2020春

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 请编码实现一个命令行工具，找出指定的2个字符串的最长公共子串。
 *
 * 输入描述:
 *
 * 命令行工具接收两个字符串参数。输入字符串的合法字符集为[a-zA-Z0-9]，大小写敏感，无需考虑异常输入场景。
 *
 * 输出描述:
 *
 * 所找到的公共子串；如果存在多个等长的公共子串，则请按字母序排序，依次打印出所有公共子串，每行一个。
 *
 * 输入例子1:
 *
 * 1234567 12893457
 *
 * 输出例子1:
 *
 * 345
 */

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int longestlength = 0;
        Set<String> ts = new TreeSet();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                StringBuilder sb = new StringBuilder();
                int a = i;
                int b = j;
                while (a < s1.length() && b < s2.length() && s1.charAt(a) == s2.charAt(b)){
                    sb.append(s1.charAt(a));
                    a++;
                    b++;
                }
                if(sb.length() > longestlength){
                    ts.clear();
                    ts.add(sb.toString());
                    longestlength = sb.length();
                } else if(sb.length() == longestlength){
                    ts.add(sb.toString());
                }
            }
        }
        Iterator is = ts.iterator();
        while (is.hasNext()){
            String s = (String) is.next();
            System.out.println(s);
        }
    }

}
