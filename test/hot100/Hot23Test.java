package hot100;

import org.junit.Test;
import structure.ListNode;

public class Hot23Test {
    @Test
    public void Test1() {
        Hot23 hot23 = new Hot23();
        ListNode[] lists = new ListNode[]{ListNode.createListNode(new int[]{1, 4, 5}),
                ListNode.createListNode(new int[]{1, 3, 4}),
                ListNode.createListNode(new int[]{2, 6})
        };

        ListNode node = hot23.mergeKLists(lists);
        ListNode.printListNode(node);
    }

    @Test
    public void Test2() {
        System.out.print("[");
        for (int i = 0; i < 9999; i++) {
            System.out.print("[");
            for (int j = 0; j < 499; j++) {
                System.out.print(1 + ",");
            }
            System.out.print(1 + "],");
        }
        System.out.print("]");
    }
}
