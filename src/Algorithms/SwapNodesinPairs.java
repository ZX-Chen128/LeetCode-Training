package Algorithms;

public class SwapNodesinPairs {

    public ListNode swapPairs(ListNode head) {

        if(head==null||head.next==null) return head;

        ListNode dummy = new ListNode(0);
        ListNode x = dummy;
        while(head!=null&&head.next!=null){
            x.next = head.next;
            head.next = x.next.next;
            x.next.next = head;
            x = x.next.next;
            head = head.next;
        }

        return dummy.next;
    }
}
