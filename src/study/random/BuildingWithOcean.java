package study.random;

import java.util.Stack;

public class BuildingWithOcean {

    public int[] findBuildings(int[] heights) {
        Stack<Integer> seen = new Stack<>();
        int max = 0;
        for (int index = heights.length-1; index >= 0; index--) {
            if (heights[index] > max) {
                seen.push(index);
                max = heights[index];
            }
        }

        int[] results = new int[seen.size()];
        int position = 0;

        while (!seen.isEmpty()) {
            results[position++] = seen.pop();
        }

        return results;
    }

}
