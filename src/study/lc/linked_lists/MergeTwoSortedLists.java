package study.lc.linked_lists;

public class MergeTwoSortedLists {

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

    public static ListNode mergeTwoSortedListsIter(ListNode a, ListNode b) {
        ListNode preHead = new ListNode(-1);
        ListNode previous = preHead;
        while (a != null && b != null) {
            if (a.val < b.val) {
                previous.next = a;
                a = a.next;
            } else {
                previous = b;
                b = b.next;
            }
            previous = previous.next;
        }


        if (a != null) {
            preHead.next = a;
        } else {
            preHead.next = b;
        }

        return preHead.next;
    }
}
