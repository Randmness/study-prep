package study.lc.recursion;

import java.util.Arrays;

public class MergeSort {

    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int pivot = nums.length/2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int[] right = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));
        return merge(left, right);
    }

    public int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, sortIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                sorted[sortIndex] = left[leftIndex];
                leftIndex++;
            } else {
                sorted[sortIndex] = right[rightIndex];
                rightIndex++;
            }

            sortIndex++;
        }

        while (leftIndex < left.length) {
            sorted[sortIndex] = left[leftIndex];
            leftIndex++;
            sortIndex++;
        }

        while (rightIndex < right.length) {
            sorted[sortIndex] = right[rightIndex];
            rightIndex++;
            sortIndex++;
        }

        return sorted;
    }
}
