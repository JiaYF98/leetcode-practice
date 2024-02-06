package question;

import org.junit.Test;
import structure.ListNode;

public class Question148Test {
    private final Question148 question148 = new Question148();

    @Test
    public void test1() {
        ListNode.printListNode(question148.sortList(ListNode.createListNode(new int[]{4, 2, 1, 3})));
    }

    @Test
    public void test2() {
        ListNode.printListNode(question148.sortList(ListNode.createListNode(new int[]{-1, 5, 3, 4, 0})));
    }

    @Test
    public void test3() {
        ListNode.printListNode(question148.sortList(ListNode.createListNode(new int[]{})));
    }
}
