package study.CTCI.ch2_linkedlists;

public class SumLists {

    public static void main(String[] args) {
        LinkedListNode num1 = Util.generateRandomLL(3, 1, 9);
        LinkedListNode num2 = Util.generateRandomLL(3, 1, 9);
        Util.printNodes(num1);
        Util.printNodes(num2);

        System.out.println(getNumberForward(num1));
        System.out.println(getNumberBackwards(num1));
        System.out.println(getNumberForward(num2));
        System.out.println(getNumberBackwards(num2));
    }

    private static int getNumberForward(LinkedListNode head) {
        LinkedListNode counter = head;
        int count = 0;
        while(counter != null) {
            counter = counter.next;
            count++;
        }

        int value = 0;
        counter = head;
        while(counter != null) {
            value += counter.data*Math.pow(10, count-1);
            count--;
            counter = counter.next;
        }

        return value;
    }

    private static int getNumberBackwards(LinkedListNode head) {
        LinkedListNode counter = head;
        int value = 0;
        int count = 0;
        while(counter != null) {
            value += counter.data * Math.pow(10, count);
            counter = counter.next;
            count++;
        }

        return value;
    }
}
