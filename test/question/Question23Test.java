package question;

import org.junit.Test;
import structure.ListNode;

public class Question23Test {
    private final Question23 question23 = new Question23();

    @Test
    public void test1() {
        ListNode.printListNode(question23.mergeKLists(new ListNode[]{
                ListNode.createListNode(new int[]{1, 4, 5}),
                ListNode.createListNode(new int[]{1, 3, 4}),
                ListNode.createListNode(new int[]{2, 6})
        }));
    }

    @Test
    public void test2() {
        ListNode.printListNode(question23.mergeKLists(new ListNode[]{}));
    }

    @Test
    public void test3() {
        ListNode.printListNode(question23.mergeKLists(null));
    }

    @Test
    public void test4() {
        ListNode.printListNode(question23.mergeKLists2(new ListNode[]{
                ListNode.createListNode(new int[]{1, 4, 5}),
                ListNode.createListNode(new int[]{1, 3, 4}),
                ListNode.createListNode(new int[]{2, 6})
        }));
    }

    @Test
    public void test5() {
        ListNode.printListNode(question23.mergeKLists2(new ListNode[]{}));
    }

    @Test
    public void test6() {
        ListNode.printListNode(question23.mergeKLists2(null));
    }
}
