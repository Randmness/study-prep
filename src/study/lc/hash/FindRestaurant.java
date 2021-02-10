package study.lc.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindRestaurant {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        int position = 0;
        while(position < list1.length) {
            map.put(list1[position], position);
            position++;
        }

        int leastIndexSum = Integer.MAX_VALUE;
        List<String> matches = new ArrayList<>();
        position = 0;
        int count = 0;
        while(position < list2.length) {
            if (map.containsKey(list2[position])) {
                int indexSum = position + map.get(list2[position]);
                if (indexSum < leastIndexSum) {
                    count = 1;
                    leastIndexSum = indexSum;
                    matches.add(list2[position]);
                    map.put(list2[position], indexSum);
                } else if (indexSum == leastIndexSum) {
                    count++;
                    matches.add(list2[position]);
                    map.put(list2[position], indexSum);
                }
            }

            position++;
        }

        String[] results = new String[count];
        position = 0;
        for (String match : matches) {
            if (map.get(match) == leastIndexSum) results[position++] = match;
            position++;
        }

        return results;
    }
}
