package study.linkedlists;

import java.util.HashSet;

public class DeleteDupes {

    public static void deleteDupes(LinkedListNode node) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        LinkedListNode previous = null;
        while(node != null) {
            if (uniqueSet.contains(node.data)) {
                previous.next = node.next;
            } else {
                uniqueSet.add(node.data);
                previous = node;
            }

            node = node.next;
        }
    }

    public static void deleteDupesNoSet(LinkedListNode head) {
        LinkedListNode current = head;

        while (current!= null) {
            LinkedListNode runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }
}
