package offer;

import structure.ListNode;

public class Offer52 {
    /*
    思路：
    1. 两个链表都遍历一遍得到各自的长度
    2. 一个指针短链表指向链表头，另一个长链表从头遍历到剩余链表长度和短链表长度一样
    3. 两个指针同时向后遍历，直到两个指针相等
     */
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 遍历两个链表
        ListNode getLengthIndexA = headA;
        ListNode getLengthIndexB = headB;
        int lengthA = 0;
        int lengthB = 0;

        while (getLengthIndexA != null) {
            lengthA++;
            getLengthIndexA = getLengthIndexA.next;
        }

        while (getLengthIndexB != null) {
            lengthB++;
            getLengthIndexB = getLengthIndexB.next;
        }

        // 指针对齐
        ListNode indexA = headA;
        ListNode indexB = headB;

        while (lengthA > lengthB) {
            indexA = indexA.next;
            lengthA--;
        }

        while (lengthA < lengthB) {
            indexB = indexB.next;
            lengthB--;
        }

        // 两个指针同时遍历
        while (indexA != indexB) {
            indexA = indexA.next;
            indexB = indexB.next;
        }

        return indexA;
    }
}
