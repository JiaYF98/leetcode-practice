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
        ListNode dum = new ListNode(0);
        ListNode head = dum;
        for (int num : nums) {
            head.next = new ListNode(num);
            head = head.next;
        }
        return dum.next;
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
