package offer;

import structure.ListNode;

public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.next == null)
            return null;

        if (head.val == val)
            return head.next;

        ListNode rightNode = head;
        ListNode leftNode = head;

        while (rightNode.next.val != val) {
            rightNode = rightNode.next;
            leftNode = leftNode.next;
        }
        rightNode = rightNode.next;
        leftNode.next = rightNode.next;

        return head;
    }
}
