package study.lc.binary_search;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        Set<Integer> dupes = new HashSet<>();

        for (int num: nums) {
            if (!dupes.add(num)) return num;
        }

        return -1;
    }
}
