package hot100;

import org.junit.Test;
import structure.ListNode;

public class Hot25Test {
    private final Hot25 hot25 = new Hot25();

    @Test
    public void test1() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode.printListNode(hot25.reverseKGroup(head, 2));
    }

    @Test
    public void test2() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode.printListNode(hot25.reverseKGroup(head, 3));
    }

    @Test
    public void test3() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode.printListNode(hot25.reverseKGroup(head, 1));
    }

    @Test
    public void test4() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode.printListNode(hot25.reverseKGroup(head, 4));
    }

    @Test
    public void test5() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode.printListNode(hot25.reverseKGroup(head, 5));
    }
}
