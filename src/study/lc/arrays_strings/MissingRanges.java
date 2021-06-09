package study.lc.arrays_strings;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    /*
    https://leetcode.com/explore/interview/card/google/59/array-and-strings/3055/
     */
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> results = new ArrayList<>();
        if (nums.length == 0) {
            results.add(lower == upper? String.valueOf(lower) : lower + "->" + upper);
        } else {
            //lower range
            if (lower < nums[0]) {
                results.add(lower == nums[0]-1? String.valueOf(lower) : lower + "->" + (nums[0]-1));
            }
            //in-between
            int previous = 0, next = 1;
            while (next < nums.length) {
                //[0,2...]
                if (nums[next] - nums[previous] == 2) {
                    results.add(String.valueOf(nums[previous]+1));
                    //[0,3....]
                } else if (nums[next] - nums[previous] > 2) {
                    results.add((nums[previous]+1) + "->" + (nums[next]-1));
                }

                previous++;
                next++;
            }

            //higher range
            if (upper > nums[nums.length-1]) {
                results.add(upper == nums[nums.length-1]+1? String.valueOf(upper) :
                        (nums[nums.length-1]+1) + "->" + upper);
            }
        }

        return results;
    }
}
