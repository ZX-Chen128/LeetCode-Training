package Algorithms;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        //申请节点，pre和 cur，pre指向null
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur!=null) {
            //记录当前节点的下一个节点
            tmp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
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
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=null;
        ListNode answer = ReverseLinkedList.reverseList(one);
        while(answer!=null){
            System.out.println(answer.val);
            answer=answer.next;
        }
    }

}