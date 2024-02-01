package question;

import org.junit.Test;
import structure.ListNode;

public class Question82Test {
    private final Question82 question82 = new Question82();

    @Test
    public void test1() {
        ListNode.printListNode(question82.deleteDuplicates(ListNode.createListNode(new int[]{1, 2, 3, 3, 4, 4, 5})));
    }

    @Test
    public void test2() {
        ListNode.printListNode(question82.deleteDuplicates(ListNode.createListNode(new int[]{1, 1, 1, 2, 3})));
    }

    @Test
    public void test3() {
        ListNode.printListNode(question82.deleteDuplicates(ListNode.createListNode(new int[]{1, 1, 1})));
    }
}
