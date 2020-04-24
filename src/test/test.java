package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * T1
 * <p>
 * Tom,Lily,Tom,Lucy,Lucy,Jack
 * <p>
 * import java.util.*;
 * <p>
 * public class Main {
 * <p>
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * String total = sc.nextLine();
 * for(Character c : total.toCharArray()){
 * if(!((c>=65&&c<=90)||(c>=97&&c<=122)||c==',')){
 * System.out.println("error.0001");
 * }
 * }
 * HashMap<String,Integer> map = new HashMap<>();
 * int vote = 1;
 * while(total.length()>0){
 * String s = total.substring(total.lastIndexOf(",")+1);
 * if(!s.equals(total)){
 * total = total.substring(0,total.lastIndexOf(","));
 * } else {
 * total = "";
 * }
 * if(!map.containsKey(s)){
 * map.put(s,1);
 * } else {
 * map.put(s,map.get(s)+1);
 * if(vote<map.get(s)){
 * vote = map.get(s);
 * }
 * }
 * }
 * TreeSet set = new TreeSet();
 * for(Map.Entry<String,Integer> x : map.entrySet()){
 * if(x.getValue() == vote){
 * set.add(x.getKey());
 * }
 * }
 * System.out.println(set.first());
 * <p>
 * }
 * <p>
 * }
 * <p>
 * ------------------------------------------------------------------------------------------------
 * <p>
 * T2
 * <p>
 * read read[addr=0x17,mask=0xff,val=0x7],read_his[addr=0xff,mask=0xff,val=0x1],read[addr=0xf0,mask=0xff,val=0x80]
 * <p>
 * <p>
 * <p>
 * public class test {
 * <p>
 * public static void main(String[] args) {
 * <p>
 * Scanner sc = new Scanner(System.in);
 * String s = sc.next();
 * String total = sc.next();
 * while(total.length()>0){
 * int index1 = total.indexOf("[");
 * int index2 = total.indexOf("]");
 * if(s.equals(total.substring(0,index1))){
 * String req = total.substring(index1+1,index2);
 * String addr = req.substring(req.indexOf("=")+1,req.indexOf(","));
 * req = req.substring(req.indexOf(",")+1);
 * String mask = req.substring(req.indexOf("=")+1,req.indexOf(","));
 * req = req.substring(req.indexOf(",")+1);
 * String val = req.substring(req.indexOf("=")+1);
 * System.out.println(addr+" "+mask+" "+val);
 * }
 * if(!(total.indexOf("[")==total.lastIndexOf("["))) {
 * total = total.substring(index2 + 2);
 * } else {
 * break;
 * }
 * }
 * }
 * <p>
 * }
 */

public class test {

    private static test uniqueInstance = new test();

    private test(){}

    public static test getInstance(){
        return uniqueInstance;
    }

}
