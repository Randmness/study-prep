package study.lc.binary_search;

public class FirstMinNumberInShiftedArray {

    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0, end = nums.length-1;
        if (nums[end] > nums[start]) {
            return nums[0];
        }

        while(start<=end) {
            int middle = start + (end-start)/2;

            if (nums[middle] > nums[middle +1]) {
                return nums[middle+1];
            }

            if (nums[middle-1] > nums[middle]) {
                return nums[middle];
            }

            //middle > start
            if (nums[middle] > nums[0]) {
                start = middle+1;
            } else {
                end = middle -1;
            }
        }

        return -1;
    }
}
