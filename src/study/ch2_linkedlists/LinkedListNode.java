package study.ch2_linkedlists;

public class LinkedListNode {
    public LinkedListNode next;
    public Integer data;

    public LinkedListNode(Integer data) {
        this.data = data;
    }

    public LinkedListNode(Integer data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }
}
