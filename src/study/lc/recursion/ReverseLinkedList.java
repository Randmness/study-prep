package study.lc.recursion;

import study.lc.support.ListNode;

import java.util.Stack;

public class ReverseLinkedList {

    public static ListNode reverseListIter(ListNode head) {
        if (head == null) return head;

        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode tmpNode = current.next;
            current.next = previous;
            previous = current;
            current = tmpNode;
        }

        return previous;
    }

    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static ListNode reverseListStack(ListNode head) {
        if (head == null || head.next == null) return head;

        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode newHead = null;
        ListNode current = null;
        while (!stack.isEmpty()) {
            if (newHead == null) {
                newHead = stack.pop();
                current = newHead;
            } else {
                current.next = stack.pop();
                current = current.next;
            }
        }

        return newHead;
    }
}
