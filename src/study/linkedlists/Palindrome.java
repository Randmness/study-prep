package study.linkedlists;

import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        LinkedListNode ll1 = Util.generateRandomLL(5);
        Util.printNodes(ll1);
        LinkedListNode reversed = reverseLL(ll1);
        Util.printNodes(reversed);
    }

    private static LinkedListNode reverseLL(LinkedListNode node) {
        LinkedListNode head = null;

        while (node != null) {
            LinkedListNode newNode = new LinkedListNode(node.data);
            newNode.next = head;
            head = newNode;
            node = node.next;
        }

        return head;
    }

    private static boolean isPalindrome(LinkedListNode node) {
        LinkedListNode fast = node;
        LinkedListNode slow = node;

        Stack<Integer> values = new Stack<>();

        while(fast != null && fast.next != null) {
            values.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        //odd case
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int topValue = values.pop();

            if (slow.data != topValue) {
                return false;
            }

            slow = slow.next;
        }

        return true;
    }
}
