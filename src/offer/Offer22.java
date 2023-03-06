package offer;

import structure.ListNode;

public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 遍历得到链表的长度
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        // 找到倒数第k个
        int index = length - k;
        int count = 0;
        while (count < index) {
            head = head.next;
            count++;
        }

        return head;
    }
}
