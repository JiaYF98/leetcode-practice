package question;

import structure.ListNode;

public class Question19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0, head);
        ListNode fastNode = head;
        while (n-- > 1) {
            fastNode = fastNode.next;
        }

        ListNode slowNode = temp;
        while (fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        slowNode.next = slowNode.next.next;
        return temp.next;
    }
}
