package study.lc.hash;

import java.util.HashMap;

public class TwoSum {

    //5,3 : 8
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int index=0; index<nums.length; index++) {
            int value = target - nums[index];

            if (map.containsKey(value)) {
                return new int[]{map.get(value), index};
            }
            map.put(nums[index], index);
        }

        throw new IllegalArgumentException("Invalid target");
    }
}
