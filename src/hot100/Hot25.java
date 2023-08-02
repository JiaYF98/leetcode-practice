package hot100;

import structure.ListNode;

public class Hot25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }

        ListNode rear = head;
        for (int i = 0; i < k - 1; i++) {
            if (rear == null || rear.next == null) {
                return head;
            }
            rear = rear.next;
        }

        ListNode next = head.next;
        head.next = reverseKGroup(rear.next, k);

        while (true) {
            rear.next = head;
            head = next;
            next = head.next;
            if (head == rear) {
                break;
            }
            head.next = rear.next;
        }

        return rear;
    }
}
