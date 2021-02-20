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


    //[1,2,3,4,5] (2) => [4, 5, 1, 2, 3]
    public void rotate2(int[] nums, int k) {
        if (nums.length == 1) return;

        int rotations = k % nums.length;
        if (rotations == nums.length) return;

        //[5,4,3,2,1]
        reverse(nums, 0, nums.length-1);
        //[4,5,3,2,1]
        reverse(nums, 0, rotations-1);
        //[4,5,1,2,3]
        reverse(nums, rotations, nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
