package hot100;

import structure.ListNode;

public class Hot19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 第一次遍历得到链表的长度
        ListNode tmp1 = head;
        int listLength = 0;
        while (tmp1 != null) {
            listLength++;
            tmp1 = tmp1.next;
        }

        // 第二次遍历，删除相应结点
        int k = listLength - n;
        if (k == 0) {
            assert head != null;
            return head.next;
        }

        ListNode tmp2 = head;
        while (k > 1) {
            tmp2 = tmp2.next;
            k--;
        }
        tmp2.next = tmp2.next.next;

        return head;
    }
}
