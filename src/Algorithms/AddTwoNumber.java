package Algorithms;

/**
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

public class AddTwoNumber {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1==null&&l2==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        int addNum = 0;
        while(l1!=null||l2!=null||addNum!=0){
            int x1 = l1==null ? 0 : l1.val;
            int x2 = l2==null ? 0 : l2.val;
            int all = x1 + x2 + addNum;
            node.next = new ListNode(all%10);
            node = node.next;
            addNum = all/10;
            if(l1!=null) {
                l1 = l1.next;
            }
            if(l2!=null) {
                l2 = l2.next;
            }
        }
        return dummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        public static String print(ListNode l){
            StringBuilder sb = new StringBuilder();
            while (l != null){
                sb.append(l.val);
                l = l.next;
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        l1.next = new ListNode(4);
        l2.next = new ListNode(6);
        l1.next.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        System.out.println(ListNode.print(addTwoNumbers(l1,l2)));
    }
}
