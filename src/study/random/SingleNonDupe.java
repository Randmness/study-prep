package study.random;

public class SingleNonDupe {

    public int singleNonDuplicate(int[] nums) {

        if (nums.length == 1) return nums[0];
        int start = 0, end = nums.length-1;

        while (start < end) {
            int middle = start + (end - start)/2;
            boolean evenUpper = (end-middle) % 2 == 0;
            if (nums[middle] == nums[middle+1]) {
                if (evenUpper) {
                    start = middle + 2;
                } else {
                    end = middle - 1;
                }
            } else if (nums[middle] ==  nums[middle-1]) {
                if (evenUpper) {
                    end = middle - 2;
                } else {
                    start = middle + 1;
                }
            } else {
                return nums[middle];
            }
        }

        return nums[start];
    }
}
