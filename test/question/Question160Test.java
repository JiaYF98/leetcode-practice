package question;

import org.junit.Test;
import structure.ListNode;

public class Question160Test {
    private final Question160 question160 = new Question160();

    @Test
    public void test1() {
        ListNode headA = ListNode.createListNode(new int[]{4, 1, 8, 4, 6});
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = headA.next.next;

        System.out.println(question160.getIntersectionNode(headA, headB).val);
    }

    @Test
    public void test2() {
        ListNode headA = ListNode.createListNode(new int[]{2, 6, 4});
        ListNode headB = ListNode.createListNode(new int[]{1, 5});

        System.out.println(question160.getIntersectionNode(headA, headB));
    }
}
