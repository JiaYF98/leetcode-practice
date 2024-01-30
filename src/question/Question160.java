package question;

import structure.ListNode;

public class Question160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null && tempB != null) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        int len = 0;
        if (tempA == null) {
            while (tempB != null) {
                tempB = tempB.next;
                len++;
            }

            while (len-- > 0) {
                headB = headB.next;
            }
        } else {
            while (tempA != null) {
                tempA = tempA.next;
                len++;
            }

            while (len-- > 0) {
                headA = headA.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            assert headB != null;
            headB = headB.next;
        }

        return null;
    }
}
