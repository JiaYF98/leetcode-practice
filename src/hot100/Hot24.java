package hot100;

import structure.ListNode;

public class Hot24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        ListNode pre = new ListNode();
        while (head != null) {
            if (head.next == null) {
                break;
            }
            ListNode next = head.next;
            head.next = next.next;
            next.next = head;
            pre.next = next;

            pre = head;
            head = head.next;
        }

        return newHead;
    }
}
