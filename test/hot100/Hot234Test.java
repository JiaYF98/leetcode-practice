package hot100;

import org.junit.Test;
import structure.ListNode;

public class Hot234Test {
    private final Hot234 hot234 = new Hot234();

    @Test
    public void test1() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 2, 1});
        System.out.println(hot234.isPalindrome(head));
    }

    @Test
    public void test2() {
        ListNode head = ListNode.createListNode(new int[]{1, 2});
        System.out.println(hot234.isPalindrome(head));
    }

    @Test
    public void test3() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 1, 2});
        System.out.println(hot234.isPalindrome(head));
    }

    @Test
    public void test4() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 1, 2, 3});
        System.out.println(hot234.isPalindrome(head));
    }
}
