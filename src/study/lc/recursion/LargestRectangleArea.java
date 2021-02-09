package study.lc.recursion;

public class LargestRectangleArea {

    public int largestRectangleArea(int[] heights) {
        return calculateArea(heights, 0, heights.length-1);
    }

    private int calculateArea(int[] heights, int start, int end) {
        if (start > end) {
            return 0;
        }

        int minindex = start;
        boolean allEqual = true;
        for (int i = start; i <= end; i++) {
            if (heights[minindex] > heights[i]) minindex = i;
            if (allEqual && heights[start] != heights[i]) allEqual = false;
        }

        if (allEqual) {
            return heights[minindex] * (end - start + 1);
        } else {
            return Math.max(heights[minindex] * (end - start + 1),
                    Math.max(calculateArea(heights, start, minindex-1),
                            calculateArea(heights, minindex + 1, end)));
        }
    }

}
