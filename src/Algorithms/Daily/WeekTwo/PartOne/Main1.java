package Algorithms.Daily.WeekTwo.PartOne;

//平安科技2020春

/**
 * 请编码实现一个命令行工具，判定两个指定的字符串是否异构同质；异构同质的定义为：一个字符串的字符重新排列后，能变成另一个字符串。
 *
 * 输入描述:
 *
 * 以空格字符分隔的两个字符串；输入字符串的合法字符集为[a-zA-Z0-9 ]，大小写敏感，无需考虑异常输入场景。
 *
 * 输出描述:
 *
 * 如果判定两个字符串异构同质，则输出true，否则输出false。
 *
 * 输入例子1:
 *
 * abc acb
 *
 * 输出例子1:
 *
 * true
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Map<Character,Integer> map = new HashMap<>();

        for (Character c : s1.toCharArray()) {
            if(!map.containsKey(c)){
                map.put(c,1);
            } else {
                map.put(c,map.get(c)+1);
            }
        }

        for (Character c : s2.toCharArray()) {
            if(!map.containsKey(c)){
                System.out.println("false");
                return;
            } else {
                map.put(c,map.get(c)-1);
            }
        }

        Character character = null;

        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            character = (Character) it.next();
            if(map.get(character) != 0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
        return;
    }

}
