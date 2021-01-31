package study.CTCI.ch3_stacks_queues;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackWithMin extends Stack<Integer> {
    private Stack<Integer> minStack;

    public StackWithMin() {
        this.minStack = new Stack<Integer>();
    }

    public void push(int item) {
        if (minStack.isEmpty() || item <= min()) {
            minStack.push(item);
        }

        super.push(item);
    }

    public Integer pop() {
        Integer poppedValue = super.pop();

        if (poppedValue == min()) {
            minStack.pop();
        }

        return poppedValue;
    }

    public int min() {
        if (minStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return minStack.peek();
    }
}
