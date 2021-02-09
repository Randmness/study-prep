package study.lc.arrays_strings;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (nums.length == 1) return;

        int iterations = 0;
        while (iterations < k%nums.length) {
            rotateOnce(nums);
        }

    }

    public void rotateOnce(int[] nums) {
        int last = nums[nums.length-1];

        for (int i = nums.length-1; i>0; i--) {
            nums[i] = nums[i-1];
        }

        nums[0] = last;
    }
}
