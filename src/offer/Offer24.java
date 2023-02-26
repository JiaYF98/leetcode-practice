package offer;

public class Offer24 {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode result = null;

        while (head != null) {
            ListNode tmp = head.next;
            head.next = result;
            result = head;
            head = tmp;
        }

        return result;
    }

    public static void add(ListNode node, int val) {
        ListNode tmp = new ListNode(node.val);
        tmp.next = node.next;
        node.val = val;
        node.next = tmp;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(5);
        add(node, 4);
        add(node, 3);
        add(node, 2);
        add(node, 1);
        ListNode result = reverseList(node);
        printList(result);
    }


}
