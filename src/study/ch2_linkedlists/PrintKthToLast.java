package study.ch2_linkedlists;

public class PrintKthToLast {

    public static void main(String[] args) {
        LinkedListNode head = Util.generateRandomLL(10);
        Util.printNodes(head);

        printKth(head, 1);
        System.out.println(retrieveKth(head, 1).data);
    }

    private static LinkedListNode retrieveKth(LinkedListNode head, int k) {
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        for (int count=0; count<k; count++) {
            if (p2.next != null) {
                p2 = p2.next;
            }
        }

        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    private static int printKth(LinkedListNode node, int k) {
        if (node == null) {
            return 0;
        }

        int index = printKth(node.next, k) + 1;

        if (index == k) {
            System.out.println(k + " item from end: " + node.data);
        }
        return index;
    }



}
