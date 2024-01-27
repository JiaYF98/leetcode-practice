package question;

import structure.ListNode;

import java.util.*;

public class Question143 {
    public void reorderList(ListNode head) {
        Queue<ListNode> queue = new LinkedList<>();
        Stack<ListNode> stack = new Stack<>();

        ListNode temp = head;
        while (temp != null) {
            queue.offer(temp);
            stack.push(temp);
            temp = temp.next;
        }

        int size = queue.size();

        ListNode prev = new ListNode();
        while (stack.size() > size / 2) {
            ListNode order = queue.poll();
            ListNode reverse = stack.pop();
            prev.next = order;
            order.next = reverse;
            prev = reverse;
        }
        prev.next = null;
    }

    public void reorderList2(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }

        int size = nodes.size();

        nodes.get(0).next = nodes.get(size - 1);
        int left = 1;
        int right = size - 1;

        while (right > left) {
            nodes.get(right--).next = nodes.get(left);
            nodes.get(left++).next = nodes.get(right);
        }

        nodes.get(right).next = null;
    }

    public void reorderList3(ListNode head) {
        ListNode middleNode = findMiddleNode(head);
        ListNode newHead = reverseList(middleNode.next);
        middleNode.next = null;
        mergeTwoList(head, newHead);
    }

    private void mergeTwoList(ListNode p, ListNode q) {
        ListNode prev = new ListNode();
        while (p != null && q != null) {
            ListNode next = p.next;

            prev.next = p;
            p.next = q;
            p = next;

            prev = q;
            q = q.next;
        }
        prev.next = p;
    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    private ListNode findMiddleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
