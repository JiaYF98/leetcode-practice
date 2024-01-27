package question;

import org.junit.Test;
import structure.ListNode;

public class Question876Test {
    private final Question876 question876 = new Question876();

    @Test
    public void test1() {
        ListNode.printListNode(question876.middleNode(ListNode.createListNode(new int[]{1, 2, 3, 4, 5})));
    }

    @Test
    public void test2() {
        ListNode.printListNode(question876.middleNode(ListNode.createListNode(new int[]{1, 2, 3, 4, 5, 6})));
    }

    @Test
    public void test3() {
        ListNode.printListNode(question876.middleNode(ListNode.createListNode(new int[]{1})));
    }
}
