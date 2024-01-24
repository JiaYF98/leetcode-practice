package question;

import structure.ListNode;

import java.util.Stack;

public class Question25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        for (int i = 0; i < k - 1; i++) {
            if (temp.next == null) {
                return head;
            }
            stack.push(temp);
            temp = temp.next;
        }
        ListNode nextGroup = temp.next;

        ListNode newHead = temp;
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }

        temp.next = reverseKGroup(nextGroup, k);

        return newHead;
    }

    public ListNode reverseKGroup2(ListNode head, int k) {
        if (k == 1) return head;
        ListNode temp = head;
        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        return reverse(head, k, len);
    }

    private ListNode reverse(ListNode head, int k, int remain) {
        if (k > remain) {
            return head;
        }

        ListNode prev = null, now = head;

        for (int i = 0; i < k; i++) {
            ListNode nextNode = now.next;
            now.next = prev;
            prev = now;
            now = nextNode;
        }

        head.next = reverse(now, k, remain - k);
        return prev;
    }
}
