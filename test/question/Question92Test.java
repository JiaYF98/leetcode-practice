package question;

import org.junit.Test;
import structure.ListNode;

public class Question92Test {
    private final Question92 question92 = new Question92();

    @Test
    public void test1() {
        ListNode.printListNode(question92.reverseBetween(ListNode.createListNode(new int[]{1, 2, 3, 4, 5}), 2, 4));
    }

    @Test
    public void test2() {
        ListNode.printListNode(question92.reverseBetween(ListNode.createListNode(new int[]{5}), 1, 1));
    }

    @Test
    public void test3() {
        ListNode.printListNode(question92.reverseBetween(ListNode.createListNode(new int[]{1, 2, 3, 4, 5}), 1, 4));
    }

    @Test
    public void test4() {
        ListNode.printListNode(question92.reverseBetween(ListNode.createListNode(new int[]{1, 2, 3, 4, 5}), 1, 5));
    }

    @Test
    public void test5() {
        ListNode.printListNode(question92.reverseBetween(ListNode.createListNode(new int[]{1, 2, 3, 4, 5}), 2, 5));
    }
}
