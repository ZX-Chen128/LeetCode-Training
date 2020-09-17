package Algorithms;

/**
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 *
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 *  * 示例 3:
 *
 * 输入: 1->2->3->2->1
 * 输出: true
 *
 */

//快慢指针找中间的同时，慢指针将前半部分翻转，这样正好在找到中点的同时将前半部分翻转成功，太强了

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        ListNode pre = null;
        ListNode cur = slow;

        while(fast != null && fast.next != null){
            fast = fast.next.next;

            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
            slow = cur;
        }
        if(fast != null) slow = slow.next;

        ListNode l1 = pre;
        ListNode l2 = slow;

        while(l1 != null && l2 != null){
            if(l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);
        first.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println(PalindromeLinkedList.isPalindrome(first));
    }
}
