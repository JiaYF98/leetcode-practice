package hot100;

import structure.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Hot23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;

        ArrayList<ListNode> allList = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                allList.add(list);
                list = list.next;
            }
        }

        int totalSize = allList.size();
        if (totalSize == 0) {
            return null;
        }

        allList.sort(Comparator.comparingInt(listNode -> listNode.val));
        for (int i = 0; i < totalSize - 1; i++) {
            allList.get(i).next = allList.get(i + 1);
        }
        allList.get(totalSize - 1).next = null;

        return allList.get(0);
    }
}
