package question;

import org.junit.Test;
import structure.ListNode;

public class Question141Test {
    private final Question141 question141 = new Question141();

    @Test
    public void test1() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        System.out.println(question141.hasCycle(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;

        System.out.println(question141.hasCycle(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);

        System.out.println(question141.hasCycle(head));
    }
}
