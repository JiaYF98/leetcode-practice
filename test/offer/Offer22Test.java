package offer;

import org.junit.Test;
import structure.ListNode;

public class Offer22Test {
    @Test
    public void Test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        ListNode head = ListNode.createListNode(nums);

        Offer22 offer22 = new Offer22();
        ListNode kthFromEnd = offer22.getKthFromEnd(head, 2);

        ListNode.printListNode(kthFromEnd);
    }

    @Test
    public void Test2() {
        int[] nums = new int[]{1};
        ListNode head = ListNode.createListNode(nums);

        Offer22 offer22 = new Offer22();
        ListNode kthFromEnd = offer22.getKthFromEnd(head, 0);

        ListNode.printListNode(kthFromEnd);
    }
}
