package Algorithms;

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode list = new ListNode(0);
        ListNode first = head;
        int count = 0;
        ListNode test = head;
        while(test!=null){
            test=test.next;
            count++;
        }
        k=k%count;
        if(k==0){
            return head;
        }
        for (int i = 0; i < k; i++) {
            first = rotate(first);
            list.next = first;

        }
        return list.next;
    }

    public static ListNode rotate(ListNode head){
        ListNode last = head;
        ListNode lastbutone = head;
        last = last.next;
        while(last.next!=null){
            last = last.next;
            lastbutone = lastbutone.next;
        }
        last.next = head;
        lastbutone.next = null;
        return last;
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
