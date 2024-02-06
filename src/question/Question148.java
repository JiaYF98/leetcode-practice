package question;

import structure.ListNode;

public class Question148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fast = head.next.next, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode rightHead = slow.next;
        slow.next = null;

        ListNode head1 = sortList(head);
        ListNode head2 = sortList(rightHead);

        return mergeTwoList(head1, head2);
    }

    private ListNode mergeTwoList(ListNode head1, ListNode head2) {
        // if (head1 == null) {
        //     return head2;
        // }
        //
        // if (head2 == null) {
        //     return head1;
        // }
        //
        // if (head1.val < head2.val) {
        //     head1.next = mergeTwoList(head1.next, head2);
        //     return head1;
        // } else {
        //     head2.next = mergeTwoList(head1, head2.next);
        //     return head2;
        // }
        ListNode prev = new ListNode();
        ListNode temp = prev;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if (head1 == null) {
            temp.next = head2;
        } else {
            temp.next = head1;
        }

        return prev.next;
    }
}
