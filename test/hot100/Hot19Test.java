package hot100;

import org.junit.Test;
import structure.ListNode;

public class Hot19Test {
    @Test
    public void Test1() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        Hot19 hot19 = new Hot19();
        ListNode node = hot19.removeNthFromEnd(head, 2);
        ListNode.printListNode(node);
    }

    @Test
    public void Test2() {
        ListNode head = ListNode.createListNode(new int[]{1});
        Hot19 hot19 = new Hot19();
        ListNode node = hot19.removeNthFromEnd(head, 1);
        ListNode.printListNode(node);
    }

    @Test
    public void Test3() {
        ListNode head = ListNode.createListNode(new int[]{1, 2});
        Hot19 hot19 = new Hot19();
        ListNode node = hot19.removeNthFromEnd(head, 1);
        ListNode.printListNode(node);
    }

    @Test
    public void Test4() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        Hot19 hot19 = new Hot19();
        ListNode node = hot19.removeNthFromEnd(head, 5);
        ListNode.printListNode(node);
    }
}
