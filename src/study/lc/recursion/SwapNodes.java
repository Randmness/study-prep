package study.lc.recursion;

import study.lc.support.ListNode;

public class SwapNodes {

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode firstNode = head;
        ListNode secondNode = head.next;

        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;
    }
}
