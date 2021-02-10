package study.lc.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionTwoArraysDupe {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> dupes = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num)>0) {
                dupes.add(num);
                map.put(num, map.get(num)-1);
            }
        }


        int[] results = new int[dupes.size()];
        int position = 0;
        for (int num: dupes) {
            results[position++] = num;
        }


        return results;
    }
}
