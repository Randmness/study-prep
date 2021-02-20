package study.lc.arrays_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int position = 0;
        while(position < numbers.length) {
            for (int i = numbers.length-1; i > position; i--) {
                if (numbers[i] + numbers[position] == target) {
                    return new int[] {position, i};
                }
            }
            position++;
        }

        return null;
    }

    //twosum sorted
    public int[] twoSum2(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while (start < end) {
            int value = numbers[start] + numbers[end];
            if (value == target) return new int[]{start, end};

            if (value > target) {
                end--;
            } else start++;
        }

        throw new IllegalArgumentException("Invalid target");
    }

    //twosum nonsorted
    public int[] twoSumNonSorted(int[] nums, int target) {
        int start = 0;
        Map<Integer, Integer> seen = new HashMap<>();
        while (start < nums.length) {
            int need = target - nums[start];
            if (seen.containsKey(need)) {
                return new int[]{seen.get(need), start};
            }

            seen.put(nums[start], start++);
        }

        throw new IllegalArgumentException("Invalid target");
    }
}
