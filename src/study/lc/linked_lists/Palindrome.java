package study.lc.linked_lists;

import study.lc.support.ListNode;

import java.util.LinkedList;

public class Palindrome {


    //O(n) time and O(n) space
    //iterate through and add items to array list; check arrayList for palindrome
    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        LinkedList<Integer> nodeValues = new LinkedList<>();
        ListNode iterNode = head;
        while (iterNode != null) {
            nodeValues.add(iterNode.val);
            iterNode = iterNode.next;
        }

        int start = 0;
        int end = nodeValues.size()-1;

        while (start<end) {
            if (!nodeValues.get(start).equals(nodeValues.get(end))) return false;
            start++;
            end--;
        }

        return true;
    }

    //O(n) and O(1) space
    //iterate through using two pointers; reverse 2nd half and compare; reverse 2nd half and append back
    public static boolean isPalindromeTwo(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode endOfFirstHalf = findMidpoint(head);
        ListNode reversedSecondHalf = reverseList(endOfFirstHalf.next);

        boolean result = true;
        ListNode list1 = head;
        ListNode list2 = reversedSecondHalf;

        while (result && list2 != null) {
            if (list1.val != list2.val) result = false;
            list1 = list1.next;
            list2 = list2.next;
        }

        //reverse second half back
        endOfFirstHalf.next = reverseList(reversedSecondHalf);
        return result;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = previous;
            previous = current;
            current = nextTemp;
        }
        return previous;
    }

    private static ListNode findMidpoint(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
