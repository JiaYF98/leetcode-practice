package offer;

import structure.ListNode;

public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode index1 = l1;
        ListNode index2 = l2;

        ListNode head;
        ListNode rear;

        if (index1.val < index2.val) {
            head = index1;
            rear = index1;
            index1 = index1.next;
        } else {
            head = index2;
            rear = index2;
            index2 = index2.next;
        }

        while (index1 != null && index2 != null) {
            if (index1.val < index2.val) {
                rear.next = index1;
                index1 = index1.next;
            } else {
                rear.next = index2;
                index2 = index2.next;
            }
            rear = rear.next;
        }

        while (index1 != null) {
            rear.next = index1;
            rear = rear.next;
            index1 = index1.next;
        }

        while (index2 != null) {
            rear.next = index2;
            rear = rear.next;
            index2 = index2.next;
        }

        return head;
    }
}
