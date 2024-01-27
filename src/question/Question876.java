package question;

import structure.ListNode;

public class Question876 {
    public ListNode middleNode(ListNode head) {
        ListNode low = head, fast = head;

        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }

        return low;
    }
}
