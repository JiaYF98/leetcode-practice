package question;

import org.junit.Test;
import structure.ListNode;

public class Question142Test {
    private final Question142 question142 = new Question142();

    @Test
    public void test1() {
        ListNode head = ListNode.createListNode(new int[]{3, 2, 0, -4});
        head.next.next.next.next = head.next;
        System.out.println(question142.detectCycle(head).val);
    }

    @Test
    public void test2() {
        ListNode head = ListNode.createListNode(new int[]{1, 2});
        head.next.next = head;
        System.out.println(question142.detectCycle(head).val);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        System.out.println(question142.detectCycle(head));
    }
}
