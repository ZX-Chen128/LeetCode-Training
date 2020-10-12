package Algorithms.JianzhiOffer;

/**
 * @Author: Chen Zixin
 * @Date: 2020/10/12 11:46 上午
 */
public class JZ5 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for(Character c : s.toCharArray()) {
            if(c.equals(' ')){
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
