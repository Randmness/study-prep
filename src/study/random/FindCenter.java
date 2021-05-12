package study.random;

import java.util.HashMap;
import java.util.Map;

public class FindCenter {

    public int findCenter(int[][] edges) {

        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();

        for (int[] row: edges) {
            for (int value: row) {
                counts.put(value, counts.getOrDefault(value, 0) +1);
            }
        }

        int key = -1;
        int max = -1;
        for (int keys: counts.keySet()) {
            if (counts.get(keys) > max) {
                key = keys;
                max = counts.get(keys);
            }
        }

        return key;
    }
}
