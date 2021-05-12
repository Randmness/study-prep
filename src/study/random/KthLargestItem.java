package study.random;

import java.util.PriorityQueue;

public class KthLargestItem {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int values : nums) {
            queue.add(values);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.poll();
    }
}
