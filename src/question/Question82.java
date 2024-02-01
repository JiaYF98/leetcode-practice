package question;

import structure.ListNode;

public class Question82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = new ListNode();
        temp.next = head;

        // 三个指针
        ListNode pre = temp;
        ListNode curr = pre.next;
        ListNode nxt = curr.next;

        while (nxt != null) {
            if (curr.val == nxt.val) {
                while (nxt != null && curr.val == nxt.val) {
                    nxt = nxt.next;
                }
                // 删除重复的元素
                pre.next = nxt;
            } else {
                pre = curr;
            }

            curr = nxt;
            // 判断上面循环结束条件是否是nxt为null
            if (nxt != null) {
                nxt = nxt.next;
            }
        }

        return temp.next;
    }
}
