package study.lc.linked_lists;

import study.lc.support.ListNode;

public class MergeTwoSortedLists {

    //https://leetcode.com/explore/interview/card/google/60/linked-list-5/3065/
    //O(n)
    public static ListNode mergeTwoSortedLists(ListNode a, ListNode b) {
        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }

        if (a.val < b.val) {
            a.next = mergeTwoSortedLists(a.next, b);
            return a;
        } else {
            b.next = mergeTwoSortedLists(a, b.next);
            return b;
        }
    }

    //O(1)
    public static ListNode mergeTwoSortedListsIter(ListNode a, ListNode b) {
        ListNode preHead = new ListNode(-1);
        ListNode previous = preHead;
        while (a != null && b != null) {
            if (a.val < b.val) {
                previous.next = a;
                a = a.next;
            } else {
                previous.next = b;
                b = b.next;
            }
            previous = previous.next;
        }


        if (a != null) {
            previous.next = a;
        } else {
            previous.next = b;
        }

        return preHead.next;
    }
}
