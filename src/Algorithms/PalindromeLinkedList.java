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
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        ListNode pre = head, prepre = null;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        if(fast != null) {
            slow = slow.next;
        }
        while(pre != null && slow != null) {
            if(pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
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
