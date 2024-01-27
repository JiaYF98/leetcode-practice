package question;

import structure.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }

        List<ListNode> resList = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                resList.add(list);
                list = list.next;
            }
        }

        if (resList.isEmpty()) {
            return null;
        }

        resList.sort(Comparator.comparingInt(o -> o.val));

        for (int i = 1; i < resList.size(); i++) {
            resList.get(i - 1).next = resList.get(i);
        }

        resList.get(resList.size() - 1).next = null;

        return resList.get(0);
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        return mergesort(lists, 0, lists.length - 1);
    }

    private ListNode mergesort(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }

        int m = (l + r) / 2;
        ListNode l1 = mergesort(lists, l, m);
        ListNode l2 = mergesort(lists, m + 1, r);
        return mergeTwoLists(l1, l2);
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
