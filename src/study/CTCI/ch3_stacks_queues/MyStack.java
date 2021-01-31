package study.CTCI.ch3_stacks_queues;

import java.util.EmptyStackException;

//LIFO
public class MyStack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public void push(T data) {
        StackNode newTop = new StackNode(data);
        newTop.next = top;
        top = newTop;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        T topData = top.data;
        top = top.next;
        return topData;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

}
