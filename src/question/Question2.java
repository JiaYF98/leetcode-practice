package question;

import structure.ListNode;

public class Question2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode();
        ListNode resPrev = prev;

        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            prev.next = new ListNode(sum % 10);
            carry = sum / 10;

            l1 = l1.next;
            l2 = l2.next;
            prev = prev.next;
        }

        while (l1 != null) {
            int sum = l1.val + carry;
            prev.next = new ListNode(sum % 10);
            carry = sum / 10;

            l1 = l1.next;
            prev = prev.next;
        }

        while (l2 != null) {
            int sum = l2.val + carry;
            prev.next = new ListNode(sum % 10);
            carry = sum / 10;

            l2 = l2.next;
            prev = prev.next;
        }

        if (carry != 0) {
            prev.next = new ListNode(carry);
        }

        return resPrev.next;
    }
}
