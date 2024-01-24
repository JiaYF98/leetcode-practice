package hot100;

import org.junit.Test;
import structure.ListNode;

public class Hot21Test {
    private final Hot21 hot21 = new Hot21();

    @Test
    public void test1() {
        ListNode.printListNode(hot21.mergeTwoLists(ListNode.createListNode(new int[]{1, 2, 4}), ListNode.createListNode(new int[]{1, 3, 4})));
    }

    @Test
    public void test2() {
        ListNode.printListNode(hot21.mergeTwoLists2(ListNode.createListNode(new int[]{}), ListNode.createListNode(new int[]{})));
    }

    @Test
    public void test3() {
        ListNode.printListNode(hot21.mergeTwoLists2(ListNode.createListNode(new int[]{}), ListNode.createListNode(new int[]{0})));
    }
}
