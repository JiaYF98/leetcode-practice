package question;

import org.junit.Test;
import structure.ListNode;

public class Question25Test {
    private final Question25 question25 = new Question25();

    @Test
    public void test1() {
        ListNode.printListNode(question25.reverseKGroup(ListNode.createListNode(new int[]{1, 2, 3, 4, 5}), 2));
    }

    @Test
    public void test2() {
        ListNode.printListNode(question25.reverseKGroup2(ListNode.createListNode(new int[]{1, 2, 3, 4, 5}), 3));
    }

    @Test
    public void test3() {
        ListNode.printListNode(question25.reverseKGroup(ListNode.createListNode(new int[]{1, 2, 3, 4, 5}), 1));
    }
}
