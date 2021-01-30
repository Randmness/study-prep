package study.linkedlists;

import java.util.HashSet;
import java.util.Stack;

public class Util {

    public static void printNodes(LinkedListNode head) {
        LinkedListNode current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static LinkedListNode generateRandomLL(int n) {
        LinkedListNode head = null;
        LinkedListNode current = null;
        for (int count=0; count<n; count++) {
            if (count == 0) {
                head = new LinkedListNode((int)(Math.random()*(15-0)));
                current = head;
            } else {
                LinkedListNode node = new LinkedListNode((int)(Math.random()*(15-0)));
                current.next = node;
                current = node;
            }
        }

        return head;
    }

    public static LinkedListNode generateRandomLL(int n, int min, int max) {
        LinkedListNode head = null;
        LinkedListNode current = null;
        for (int count=0; count<n; count++) {
            if (count == 0) {
                head = new LinkedListNode((int)(Math.random()*(max-min)));
                current = head;
            } else {
                LinkedListNode node = new LinkedListNode((int)(Math.random()*(max-min)));
                current.next = node;
                current = node;
            }
        }

        return head;
    }
}