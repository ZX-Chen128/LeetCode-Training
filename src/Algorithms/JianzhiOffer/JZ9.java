package Algorithms.JianzhiOffer;

/**
 * @Author: Chen Zixin
 * @Date: 2020/10/12 1:58 下午
 */

import java.util.LinkedList;

/**
 * 示例 1：
 * <p>
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 * <p>
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 * 1,2,3,4,5
 */

public class JZ9 {

    LinkedList<Integer> A,B;

    public JZ9() {
        A = new LinkedList<>();
        B = new LinkedList<>();
    }

    public void appendTail(int value) {
        A.add(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()) return B.removeLast();
        if(A.isEmpty()) return -1;
        while(!A.isEmpty()) {
            B.add(A.removeLast());
        }
        return B.removeLast();
    }

    public static void main(String[] args) {
        JZ9 obj = new JZ9();
        System.out.println(obj.deleteHead());
        obj.appendTail(5);
        obj.appendTail(5);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
    }
}
