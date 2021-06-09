package study.lc.binary_search;

public class FindFirstLastPosition {

    //https://leetcode.com/explore/interview/card/google/63/sorting-and-searching-4/3081/
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[] {-1, -1};

        int findFirstPostion = searchOccurrence(true, nums, target);
        if (findFirstPostion == -1) return new int[] {-1, -1};
        int findLastPosition = searchOccurrence(false, nums, target);

        return new int[] {findFirstPostion, findLastPosition};
    }

    private int searchOccurrence(boolean first, int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while (left <= right) {
            int middle = left + (right - left) /2;

            if (nums[middle] == target) {
                if (first) {
                    if (middle == 0 || nums[middle-1] != target) return middle;
                    else right = middle-1;
                } else {
                    if (middle == nums.length-1 || nums[middle+1] != target) return middle;
                    else left = middle+1;
                }
            } else if (nums[middle] > target) {
                right = middle -1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
