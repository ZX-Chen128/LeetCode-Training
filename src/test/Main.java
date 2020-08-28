package test;

import java.util.*;

/**
 * @Author: Chen Zixin
 * @Date: 2020/8/23 8:28 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int index = sc.nextInt();
        int length = s.length();
        Map<Integer,String> hashmap = new HashMap<>();
        Set<String> treeset = new TreeSet<>();
        int count = 0;
        for (int i = 0; i <= length; i++) {
            for (int j = i; j <= length; j++) {
                hashmap.put(count++,s.substring(i,j));
            }
        }
        System.out.println(hashmap);
        for (int i = 1; i < hashmap.size(); i++) {
            treeset.add(hashmap.get(i));
        }
        System.out.println(treeset);
        Iterator<String> iterator = treeset.iterator();
        for (int i = 0; i < index; i++) {
            iterator.next();
        }
        System.out.println(iterator.next());
    }
}
