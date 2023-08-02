package hot100;

import org.junit.Test;
import structure.ListNode;

public class Hot24Test {
    private final Hot24 hot24 = new Hot24();

    @Test
    public void test1() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4});
        ListNode.printListNode(hot24.swapPairs(head));
    }

    @Test
    public void test2() {
        ListNode head = ListNode.createListNode(new int[]{});
        ListNode.printListNode(hot24.swapPairs(head));
    }

    @Test
    public void test3() {
        ListNode head = ListNode.createListNode(new int[]{1});
        ListNode.printListNode(hot24.swapPairs(head));
    }

    @Test
    public void test4() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode.printListNode(hot24.swapPairs(head));
    }

    @Test
    public void test5() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5, 6, 7});
        ListNode.printListNode(hot24.swapPairs(head));
    }
}
