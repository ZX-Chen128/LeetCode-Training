package Algorithms;

/**
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        ListNode b1 = new ListNode(0);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;
        ListNode answer = MergeTwoSortedLists.mergeTwoLists(a1,b1);
        while(answer!=null){
            System.out.println(answer.val);
            answer=answer.next;
        }
    }
}
