package test;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        StringBuffer abc = new StringBuffer("abc        cba");
//        int length = abc.length();
//        for (int i = 0; i < length; i++) {
//            if(abc.charAt(i) == ' '){
//
//            }
//        }
        System.out.println(abc.delete(3,11));
    }
}
