package study.lc.binary_search;

public class SearchForRange {

    //https://leetcode.com/explore/interview/card/google/63/sorting-and-searching-4/3081/
    public int[] searchRange(int[] nums, int target) {
        int[] results = new int[] {-1, -1};

        int position = 0;
        for (int index=0; index<nums.length; index++) {
            if (nums[index] == target) {
                results[0] = index;
                break;
            }
        }

        if (results[0] == -1) return results;

        for (int index = nums.length-1; index >= 0; index--) {
            if (nums[index] == target) {
                results[1] = index;
                break;
            }
        }

        return results;
    }
}
