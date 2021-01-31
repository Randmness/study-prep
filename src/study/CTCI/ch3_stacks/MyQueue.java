package study.CTCI.ch3_stacks;

import java.util.NoSuchElementException;

//FIFO
public class MyQueue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> frontNode;
    private QueueNode<T> lastNode;

    public void add(T data) {
        QueueNode<T> newNode = new QueueNode<>(data);
        if (lastNode != null) {
            lastNode.next = newNode;
        }

        lastNode = newNode;

        if (frontNode == null) {
            frontNode = lastNode;
        }
    }

    public T peek() {
        if (frontNode == null) {
            return  null;
        }

        return frontNode.data;
    }

    public T remove() {
        if (frontNode == null) {
            throw new NoSuchElementException();
        }

        T data = frontNode.data;
        frontNode = frontNode.next;
        if (frontNode == null) {
            lastNode = null;
        }

        return data;
    }

    public boolean isEmpty() {
        return frontNode == null;
    }
}
