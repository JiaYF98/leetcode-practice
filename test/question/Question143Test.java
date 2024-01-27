package question;

import org.junit.Test;
import structure.ListNode;

public class Question143Test {
    private final Question143 question143 = new Question143();

    @Test
    public void test1() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4});
        question143.reorderList(head);
        ListNode.printListNode(head);
    }

    @Test
    public void test2() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        question143.reorderList(head);
        ListNode.printListNode(head);
    }

    @Test
    public void test3() {
        ListNode head = ListNode.createListNode(new int[]{1});
        question143.reorderList(head);
        ListNode.printListNode(head);
    }

    @Test
    public void test4() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4});
        question143.reorderList2(head);
        ListNode.printListNode(head);
    }

    @Test
    public void test5() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        question143.reorderList2(head);
        ListNode.printListNode(head);
    }

    @Test
    public void test6() {
        ListNode head = ListNode.createListNode(new int[]{1});
        question143.reorderList2(head);
        ListNode.printListNode(head);
    }

    @Test
    public void test7() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4});
        question143.reorderList3(head);
        ListNode.printListNode(head);
    }

    @Test
    public void test8() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        question143.reorderList3(head);
        ListNode.printListNode(head);
    }

    @Test
    public void test9() {
        ListNode head = ListNode.createListNode(new int[]{1});
        question143.reorderList3(head);
        ListNode.printListNode(head);
    }
}
