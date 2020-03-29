package test;

import java.util.*;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[] ss = new String[1000];
        int i = 0;
        while(sc.hasNext()){

            String s = sc.next();
            ss[i] = s;
            i++;

        }
        for(int j = i;j>=0;j--){
            sb.append(ss[j]);
        }

        System.out.println(sb.toString());

    }

}
