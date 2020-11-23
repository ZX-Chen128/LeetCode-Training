package Algorithms.JianzhiOffer;

/**
 * @Author: Chen Zixin
 * @Date: 2020/10/12 1:35 下午
 */

import java.util.Arrays;

/**
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */

public class JZ6 {
    public int[] reversePrint(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        int length = 0;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
            length++;
        }
        ListNode start = pre;
        int[] res = new int[length];
        int index = 0;
        while (start != null) {
            res[index] = start.val;
            start = start.next;
        }
        return res;
    }
}
