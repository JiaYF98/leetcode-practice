package hot100;

import org.junit.Test;
import structure.ListNode;

public class Hot206Test {
    private final Hot206 hot206 = new Hot206();

    @Test
    public void test1() {
        ListNode.printListNode(hot206.reverseList(ListNode.createListNode(new int[]{1, 2, 3, 4, 5})));
    }
}
