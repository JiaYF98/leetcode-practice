package hot100;

import structure.ListNode;

import java.util.Stack;

public class Hot234 {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }

        Stack<ListNode> stack = new Stack<>();

        ListNode index = head;
        while (index != null) {
            stack.push(index);
            index = index.next;
        }

        int length = stack.size();
        index = head;
        while (stack.size() >= length / 2) {
            if (stack.pop().val != index.val) {
                return false;
            }
            index = index.next;
        }

        return true;
    }
}
