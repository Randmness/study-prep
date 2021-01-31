package study.stack;


//Stack: items are added in reverse
public class ThreeStacksInArray {
    private int numberOfStacks = 3;
    private int stackSize;
    private int[] values;
    private int[] stackCounts;


    public ThreeStacksInArray(int stackSize) {
        this.stackSize = stackSize;
        this.values = new int[(stackSize * numberOfStacks)];
        this.stackCounts = new int[numberOfStacks];
    }

    public void push(int stackNumber, int data) {
        //check if full
        stackCounts[stackNumber]++;
        int currentIndex = getStackTop(stackNumber);
        values[currentIndex] = data;
    }

    public int pop(int stackNumber) {
        int indexOfTop = getStackTop(stackNumber);
        int data = values[indexOfTop];
        values[indexOfTop] = 0;
        stackCounts[stackNumber]--;
        return data;
    }

    public int peep(int stackNumber) {
        return values[getStackTop(stackNumber)];
    }

    public boolean isEmpty(int stackNumber) {
        return stackCounts[stackNumber] > 0;
    }

    public boolean isFull(int stackNumber) {
        return values[stackNumber] == stackSize;
    }

    private int getStackTop(int stackNumber) {
        int startOfStack = stackNumber * stackSize;
        int offset = stackCounts[stackNumber];
        return startOfStack + offset - 1;
    }
}
