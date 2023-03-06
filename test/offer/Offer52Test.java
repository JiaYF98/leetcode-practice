package offer;

import org.junit.Test;
import structure.ListNode;

public class Offer52Test {
    @Test
    public void Test1() {
        ListNode headA = ListNode.createListNode(new int[]{4, 1, 8, 4, 5});
        ListNode headB = ListNode.createListNode(new int[]{5, 0, 1});

        int skipA = 2;
        int skipB = 3;
        ListNode tempA = headA;
        ListNode tempB = headB;

        while (--skipA != 0) {
            assert tempA != null;
            tempA = tempA.next;
        }

        while (--skipB != 0) {
            assert tempB != null;
            tempB = tempB.next;
        }

        tempB.next = tempA.next;

        Offer52 offer52 = new Offer52();
        ListNode intersectionNode = offer52.getIntersectionNode(headA, headB);
        ListNode.printListNode(intersectionNode);
    }
}
