package hot100;

import structure.ListNode;

public class Hot141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head.next;
        ListNode quick = head.next.next;

        while (quick != null) {
            if (quick == slow) {
                return true;
            }

            if (quick.next == null) {
                return false;
            }

            quick = quick.next.next;
            slow = slow.next;
        }

        return false;
    }
}
