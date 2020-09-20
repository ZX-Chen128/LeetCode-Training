package Algorithms;

import java.lang.Runnable;
import java.util.concurrent.Callable;
import java.util.function.*;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;
        ListNode answer = ReverseLinkedList.reverseList(one);
        while (answer != null) {
            System.out.println(answer.val);
            answer = answer.next;
        }
    }

}