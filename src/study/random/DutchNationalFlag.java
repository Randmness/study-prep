package study.random;

import java.util.Collections;

public class DutchNationalFlag {

    public void sortColors(int[] nums) {
        if (nums.length <= 1) return;

        int white = 1;

        int lower = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < white) {
                int tmp = nums[lower];
                nums[lower++] = nums[index];
            }
        }

        int upper = nums.length-1;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > white) {
                int tmp = nums[upper];
                nums[upper++] = nums[index];
            }
        }
    }

    public void sortColorsTwo(int[] nums) {
        if (nums.length <= 1) return;

        int left = 0, right = nums.length-1, current = 0;

        while (current < right) {
            if (nums[current] == 0) {
                int tmp = nums[left];
                nums[left] = nums[current];
                nums[current] = tmp;
                current++;
                left++;
            } else if (nums[current] == 2) {
                int tmp = nums[current];
                nums[current] = nums[right];
                nums[right] = tmp;
                right--;
            } else {
                current++;
            }
        }
    }

}
