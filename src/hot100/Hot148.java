package hot100;

import structure.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hot148 {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }

        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }

        list.sort(Comparator.comparingInt(node -> node.val));

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        list.get(list.size() - 1).next = null;

        return list.get(0);
    }
}
