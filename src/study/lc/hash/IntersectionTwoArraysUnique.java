package study.lc.hash;

import java.util.HashSet;

public class IntersectionTwoArraysUnique {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Set = new HashSet<>();
        for (int num: nums1) nums1Set.add(num);

        HashSet<Integer> nums2Set = new HashSet<>();
        for (int num: nums2)  nums2Set.add(num);

        nums1Set.retainAll(nums2Set);

        int[] results = new int[nums1Set.size()];
        int index =0;
        for (Integer values : nums1Set) {
            results[index++] = values;
        }
        return results;
    }
}
