package Algorithms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Deque<Character> dq = new ArrayDeque<>();
        for (Character c: s.toCharArray() ){
            if ( c=='(' || c=='[' || c=='{' ){
                dq.push(c);
            } else {
                if ( dq.size() == 0 || map.get(c) != dq.pop() ){
                    return false;
                }
            }
        }

        return dq.size()==0;

    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid("[{"));
    }

}
