package structure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createListNode(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int len = nums.length;

        ListNode head = new ListNode(nums[len - 1]);

        for (int i = len - 2; i >= 0; i--) {
            ListNode node = new ListNode(nums[i]);
            node.next = head;
            head = node;
        }

        return head;
    }

    public static void printListNode(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }

        while (head.next != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }

        System.out.println(head.val);
    }
}
