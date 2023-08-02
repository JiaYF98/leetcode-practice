package hot100;

import org.junit.Test;
import structure.ListNode;

public class Hot148Test {
    private final Hot148 hot148 = new Hot148();

    @Test
    public void test1() {
        ListNode head = ListNode.createListNode(new int[]{4, 2, 1, 3});
        ListNode.printListNode(hot148.sortList(head));
    }

    @Test
    public void test2() {
        ListNode head = ListNode.createListNode(new int[]{1});
        ListNode.printListNode(hot148.sortList(head));
    }

    @Test
    public void test3() {
        ListNode.printListNode(hot148.sortList(null));
    }
}
