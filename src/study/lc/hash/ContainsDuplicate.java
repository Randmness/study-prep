package study.lc.hash;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        HashSet<Integer> uniqueInts = new HashSet<>();
        for (int number: nums) {
            if (!uniqueInts.add(number)) return true;
        }

        return false;
    }
}
