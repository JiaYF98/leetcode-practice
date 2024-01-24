package question;

import org.junit.Test;
import structure.ListNode;

public class Question206Test {
    private final Question206 question206 = new Question206();

    @Test
    public void test1() {
        ListNode.printListNode(question206.reverseList2(ListNode.createListNode(new int[]{1, 2, 3, 4, 5})));
    }

    @Test
    public void test2() {
        ListNode.printListNode(question206.reverseList(ListNode.createListNode(new int[]{1, 2})));
    }

    @Test
    public void test3() {
        ListNode.printListNode(question206.reverseList(ListNode.createListNode(new int[]{})));
    }


    @Test
    public void test4() {
        ListNode.printListNode(question206.reverseList(ListNode.createListNode(new int[]{1})));
    }
}
