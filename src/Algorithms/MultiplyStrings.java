package Algorithms;

import test.test;

public class MultiplyStrings {
    public static String multiply(String a, String b) {
        StringBuffer sb = new StringBuffer();

        int[] ans = new int[a.length() + b.length()];

        for (int i = b.length() - 1; i >= 0; i--) {
            for (int j = a.length() - 1; j >= 0; j--) {
                ans[i + j + 1] += (b.charAt(i) - '0') * (a.charAt(j) - '0');
            }
        }

        int add = 0;

        for (int i = ans.length - 1; i >= 0; i--) {
            int tmp = (ans[i] + add) / 10;
            ans[i] = (ans[i] + add) % 10;
            add = tmp;
        }

        for(int i : ans) {
            sb.append(i);
        }

        return new String(sb).substring(1);
    }

    public static void main(String[] args) {
        System.out.println(MultiplyStrings.multiply("123","1234"));
    }
}
