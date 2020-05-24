package Algorithms.Daily.WeekOne.PartTwo;

import java.util.*;

/**
 * 给定一个未排序数组,找出其中最长的等差数列(无需保证数字顺序)。
 */

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m==0){
            System.out.println(0);
            return;
        }else if(m==1){
            System.out.println(1);
            return;
        }
        int[] ints = new int[m];
        int index = 0;
        Map<Integer,Map<Integer,Integer>> map = new HashMap<>();
        while(sc.hasNext()){
            ints[index] = Integer.parseInt(sc.next());
            map.put(index,new HashMap<>());
            index++;
        }
        int mnum = Integer.MIN_VALUE;
        Arrays.sort(ints);
        int diff = 0;
        for(int i=1;i<ints.length;i++){
            for(int j=0;j<i;j++){
                diff = ints[i] - ints[j];
                if(!map.get(j).containsKey(diff)){
                    map.get(i).put(diff,2);
                }else{
                    int p = map.get(j).get(diff)+1;
                    map.get(i).put(diff,p);
                }
                mnum = Math.max(map.get(i).get(diff),mnum);
            }
        }
        System.out.println(mnum);
    }
}
