package study.lc.linked_lists;

import study.lc.support.ListNode;

public class Rotate {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int count = 1;
        ListNode tail = head;
        while(tail.next != null) {
            count++;
            tail = tail.next;
        }

        int rotation = k % count;
        if (rotation == 0) {
            return head;
        }

        ListNode offset = head;
        int offsetCount = 0;
        while (offsetCount < rotation) {
            offset = offset.next;
            offsetCount++;
        }

        ListNode newTail = head;
        while (offset.next != null) {
            newTail = newTail.next;
            offset = offset.next;
        }


        ListNode newHead = newTail.next;
        newTail.next = null;
        offset.next = head;

        return newHead;
    }
}
