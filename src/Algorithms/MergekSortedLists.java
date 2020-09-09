package Algorithms;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/9 3:57 下午
 */

/**
 * 示例 1：
 * <p>
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 * 解释：链表数组如下：
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 将它们合并到一个有序链表中得到。
 * 1->1->2->3->4->4->5->6
 * 示例 2：
 * <p>
 * 输入：lists = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：lists = [[]]
 * 输出：[]
 */

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return merge(lists, 0, lists.length - 1);
    }

    // 保证了搜索的时间复杂度为 O(logN)
    public ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];
        int mid = (left + right) / 2;

        ListNode l1 = merge(lists, left, mid);
        ListNode l2 = merge(lists, mid + 1, right);

        return merge2Lists(l1, l2);
    }

    // 合并两个有序链表的方法 贼简单的递归
    public ListNode merge2Lists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = merge2Lists(l1.next, l2);
            return l1;
        } else {
            l2.next = merge2Lists(l1, l2.next);
            return l2;
        }

    }

}
