package study.CTCI.ch3_stacks;

import java.util.Stack;

public class QueueWithTwoStacks<T> {
    //newest -> oldest
    Stack<T> newestStack = new Stack<T>();

    //oldest -> newest
    Stack<T> oldestStack = new Stack<T>();

    public void add(T item) {
        newestStack.add(item);
    }

    private void shiftStacks() {
        if (oldestStack.isEmpty()) {
            oldestStack.push(newestStack.pop());
        }
    }

    public T remove() {
        shiftStacks();
        return oldestStack.pop();
    }

    public T peek() {
        shiftStacks();
        return oldestStack.peek();
    }
}
