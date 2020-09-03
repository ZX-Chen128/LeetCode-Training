package Algorithms;

public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }


        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (fast != slow && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }

}
