package study.lc.arrays_strings;

public class DominantIndex {

    public int dominantIndex(int[] nums) {
        if (nums == null) {
            return -1;
        } else if (nums.length == 1) return 0;

        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] > nums[maxIndex]) maxIndex = i;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] < nums[i]* 2) return -1;
        }

        return maxIndex;
    }
}
