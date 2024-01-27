package question;

import structure.ListNode;

public class Question92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode temp = new ListNode();
        temp.next = head;
        ListNode startNode = temp;
        ListNode endNode = temp;

        int length = right - left;
        for (int i = 0; i < length; i++) {
            endNode = endNode.next;
        }

        for (int i = 0; i < left - 1; i++) {
            startNode = startNode.next;
            endNode = endNode.next;
        }
        ListNode beforeNode = startNode;
        startNode = startNode.next;
        endNode = endNode.next;

        beforeNode.next = reverseListNode(startNode, endNode, endNode.next);

        return temp.next;
    }

    private ListNode reverseListNode(ListNode startNode, ListNode endNode, ListNode nextNode) {
        if (startNode == endNode) {
            return startNode;
        }

        ListNode newHead = reverseListNode(startNode.next, endNode, nextNode);
        startNode.next.next = startNode;
        startNode.next = nextNode;
        return newHead;
    }
}
