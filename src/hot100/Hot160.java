package hot100;

import structure.ListNode;

public class Hot160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headALength = 0;
        int headBLength = 0;

        ListNode indexA = headA;
        ListNode indexB = headB;

        while (indexA != null) {
            headALength++;
            indexA = indexA.next;
        }

        while (indexB != null) {
            headBLength++;
            indexB = indexB.next;
        }

        int diff = headALength - headBLength;

        if (diff > 0) {
            while (diff > 0) {
                headA = headA.next;
                diff--;
            }
        } else if (diff < 0) {
            while (diff < 0) {
                headB = headB.next;
                diff++;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
