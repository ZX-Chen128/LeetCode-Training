package Algorithms.Daily.WeekOne.PartTwo;

import java.util.*;

//拼多多2020春

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合，按照字典序升序排序,如果有重复的结果需要去重
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */

public class Main3 {

    public static List<String> findA(Map<Character,String> map,List<String> list,String num,int index,String s){
        if(index == num.length()){
            list.add(s);
            return list;
        }
        String p = map.get(num.charAt(index));
        for(int i=0;i<p.length();i++){
            findA(map,list,num,index+1,s+p.charAt(i));
        }
        return list;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> list = new ArrayList<>();
        findA(map,list,num,0,"");
        System.out.println(list);
    }
}
