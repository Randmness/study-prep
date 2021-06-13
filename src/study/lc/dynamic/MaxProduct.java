package study.lc.dynamic;

public class MaxProduct {

    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int currentMax = nums[0];
        int currentMin = nums[0];
        int result = currentMax;

        for (int index=1; index < nums.length; index++) {
            int num = nums[index];
            int tmpMax = Math.max(num, Math.max(currentMax * num, currentMin * num));
            currentMin = Math.min(num, Math.min(currentMax * num, currentMin * num));

            currentMax = tmpMax;

            result = Math.max(currentMax, result);
        }

        return result;
    }
}
