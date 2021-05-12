package study.lc.arrays_strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) return nums;


        List<Integer> tmpResult = new ArrayList<>();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        int start = 0;
        int end = 0;
        while (start + k <= nums.length) {
            while (end - start != k) {
                minHeap.add(nums[end]);
                end++;
            }

            if (start > 0) {
                minHeap.remove(nums[start-1]);
            }

            tmpResult.add(minHeap.peek());
            start++;
        }


        int[] result = new int[tmpResult.size()];
        int position = 0;
        for (Integer value: tmpResult) {
            result[position++] = value;
        }

        return result;
    }
}
