package study.lc.linked_lists;

import study.lc.support.ListNode;

public class AddTwoNumbers {


    //[2,0,2] + [1,8,7,7] = 202 + 7781
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        int carryOver = 0;
        ListNode p1 = l1, p2 = l2, current = preHead;
        while(p1 != null || p2 != null) {
            int x = 0, y = 0;
            if (p1 != null) x = p1.val;
            if (p2 != null) y = p2.val;

            int sum = x + y + carryOver;
            carryOver = (sum > 9) ? 1 : 0;
            current.next = new ListNode((sum>9)? sum-10: sum);
            current = current.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        if (carryOver > 0) {
            current.next = new ListNode(1);
        }

        return preHead.next;
    }
}
