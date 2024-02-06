package question;

import org.junit.Test;
import structure.ListNode;

public class Question2Test {
    private final Question2 question2 = new Question2();

    @Test
    public void test1() {
        ListNode.printListNode(question2.addTwoNumbers(ListNode.createListNode(new int[]{2, 4, 3}), ListNode.createListNode(new int[]{5, 6, 4})));
    }

    @Test
    public void test2() {
        ListNode.printListNode(question2.addTwoNumbers(ListNode.createListNode(new int[]{0}), ListNode.createListNode(new int[]{0})));
    }

    @Test
    public void test3() {
        ListNode.printListNode(question2.addTwoNumbers(ListNode.createListNode(new int[]{9, 9, 9, 9, 9, 9, 9}), ListNode.createListNode(new int[]{9, 9, 9, 9})));
    }
}
