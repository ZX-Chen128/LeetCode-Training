package Algorithms.JianzhiOffer;

/*
    请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字
    符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

import java.util.ArrayList;
import java.util.List;

public class JZ2 {
    public static String replaceSpace(StringBuffer str) {
        int length = str.length();
        List<StringBuffer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        int index = 0;
        for (int i = 0; i < length; i++) {
            if(str.charAt(i) == ' '){
                StringBuffer s = new StringBuffer(str.substring(index, i));
                s.append("%20");
                list.add(s);
                while(str.charAt(i+1) == ' '){
                    i++;
                }
                index = i + 1;
            }
        }
        StringBuffer sbb = new StringBuffer(str.substring(index,length));
        list.add(sbb);
        for (StringBuffer s : list) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(JZ2.replaceSpace(new StringBuffer("We Are Happy")));
    }
}
