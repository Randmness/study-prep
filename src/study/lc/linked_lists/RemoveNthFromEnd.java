package study.lc.linked_lists;

import study.lc.support.ListNode;

public class RemoveNthFromEnd {

    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (n==1 && head.next == null) return null;

        ListNode preHead = new ListNode(-1);
        preHead.next = head;

        int offset = 0;
        ListNode offsetNode = preHead;
        while (offset < n) {
            offsetNode = offsetNode.next;
            offset++;
        }

        ListNode beforeKth = preHead;
        while (offsetNode.next != null) {
            offsetNode = offsetNode.next;
            beforeKth = beforeKth.next;
        }

        beforeKth.next = beforeKth.next.next;
        return preHead.next;
    }
}
