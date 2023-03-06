package offer;

import org.junit.Test;
import structure.ListNode;

public class Offer25Test {
    @Test
    public void Test1() {
        Offer25 offer25 = new Offer25();
        ListNode l1 = ListNode.createListNode(new int[]{1, 2, 4});
        ListNode l2 = ListNode.createListNode(new int[]{1, 3, 4});

        ListNode head = offer25.mergeTwoLists(l1, l2);
        ListNode.printListNode(head);
    }

    @Test
    public void Test2() {
        Offer25 offer25 = new Offer25();
        ListNode l1 = ListNode.createListNode(new int[]{});
        ListNode l2 = ListNode.createListNode(new int[]{1, 3, 4});

        ListNode head = offer25.mergeTwoLists(l1, l2);
        ListNode.printListNode(head);
    }

    @Test
    public void Test3() {
        Offer25 offer25 = new Offer25();
        ListNode l1 = ListNode.createListNode(new int[]{1, 2, 4});
        ListNode l2 = ListNode.createListNode(new int[]{});

        ListNode head = offer25.mergeTwoLists(l1, l2);
        ListNode.printListNode(head);
    }

    @Test
    public void Test4() {
        Offer25 offer25 = new Offer25();
        ListNode l1 = ListNode.createListNode(new int[]{});
        ListNode l2 = ListNode.createListNode(new int[]{});

        ListNode head = offer25.mergeTwoLists(l1, l2);
        ListNode.printListNode(head);
    }

    @Test
    public void Test5() {
        Offer25 offer25 = new Offer25();
        ListNode l1 = ListNode.createListNode(new int[]{1, 1, 1, 1});
        ListNode l2 = ListNode.createListNode(new int[]{2, 2, 2, 2});

        ListNode head = offer25.mergeTwoLists(l1, l2);
        ListNode.printListNode(head);
    }
}
