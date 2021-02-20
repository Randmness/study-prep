package study.lc.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        results.add(new ArrayList<>());

        for (int number: nums) {
            List<List<Integer>> temps = new ArrayList<>();

            for (List<Integer> result : results) {
                List<Integer> temp = new ArrayList<>(result);
                temp.add(number);
                temps.add(temp);
            }

            for (List<Integer> temp: temps) {
                results.add(temp);
            }
        }

        return results;

    }
}
