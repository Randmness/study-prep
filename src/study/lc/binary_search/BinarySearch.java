package study.lc.binary_search;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while (left<=right) {
            int middle = left + (right - left)/2;

            if (nums[middle] > target) right = middle-1;
            else if (nums[middle]  < target) left = middle + 1;
            else return middle;

        }

        return -1;
    }

    public int searchRec(int[] nums, int start, int end, int target) {
        if (start < end) return -1;

        int middle = start + (end - start)/2;

        if (nums[middle] > target) {
            return searchRec(nums, start, middle-1, target);
        }
        else if (nums[middle] < target) {
            return searchRec(nums, middle+1, end, target);
        }
        else {
            return middle;
        }
    }
}
