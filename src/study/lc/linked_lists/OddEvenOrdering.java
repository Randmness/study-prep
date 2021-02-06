package study.lc.linked_lists;

import java.util.LinkedList;

public class OddEvenOrdering {


    //O(n) time and O(1) space
    //odd nodes and then even nodes
    public static ListNode oddEven(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
}
