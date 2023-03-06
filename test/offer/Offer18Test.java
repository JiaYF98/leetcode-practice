package offer;

import org.junit.Test;
import structure.ListNode;

public class Offer18Test {
    @Test
    public void Test1() {
        Offer18 offer18 = new Offer18();
        int[] nums = new int[]{4, 5, 1, 9};

        ListNode head = ListNode.createListNode(nums);

        assert head != null;
        head = offer18.deleteNode(head, 5);

        ListNode.printListNode(head);
    }

    @Test
    public void Test2() {
        Offer18 offer18 = new Offer18();
        int[] nums = new int[]{1};

        ListNode head = ListNode.createListNode(nums);

        assert head != null;
        head = offer18.deleteNode(head, 1);

        ListNode.printListNode(head);
    }
}
