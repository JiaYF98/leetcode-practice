package offer;

import structure.ListNode;

import java.util.ArrayList;

public class Offer06 {
//    public int[] reversePrint(structure.ListNode head) {
//        if (head == null) {
//            return new int[0];
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        while (head != null) {
//            stack.push(head.val);
//            head = head.next;
//        }
//
//        int[] array = new int[stack.size()];
//
//        int i = 0;
//        while (!stack.isEmpty()) {
//            array[i++] = stack.pop();
//        }
//        return array;
//    }

    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> reverseList = new ArrayList<>();

        reverse(head, reverseList);

        int[] result = new int[reverseList.size()];

        for (int i = 0; i < reverseList.size(); i++) {
            result[i] = reverseList.get(i);
        }

        return result;
    }

    public void reverse(ListNode head, ArrayList<Integer> reverseArray) {
        if (head == null) {
            return;
        }
        reverse(head.next, reverseArray);
        reverseArray.add(head.val);
    }
}
