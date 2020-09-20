package Algorithms;

public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        int length = 0;
        ListNode findLength = head;
        while (findLength != null) {
            findLength = findLength.next;
            length++;
        }

        k %= length;
        if(k == 0) return head;

        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode newEnd = slow;
        ListNode newHead = slow.next;

        fast.next = head;
        newEnd.next = null;
        return newHead;
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
        ListNode answer = RotateList.rotateRight(one,2);
        while(answer!=null){
            System.out.println(answer.val);
            answer=answer.next;
        }
    }
}
