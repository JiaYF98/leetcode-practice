package hot100;

import org.junit.Test;
import structure.ListNode;

public class Hot141Test {
    private final Hot141 hot141 = new Hot141();

    @Test
    public void test1() {
        ListNode head = ListNode.createListNode(new int[]{3, 2, 0, -4});
        ListNode index = head;
        while (index.next != null) {
            index = index.next;
        }

        index.next = head.next;

        System.out.println(hot141.hasCycle(head));
    }

    @Test
    public void test2() {
        ListNode head = ListNode.createListNode(new int[]{1, 2});
        assert head != null;
        head.next.next = head;
        System.out.println(hot141.hasCycle(head));

    }
}
