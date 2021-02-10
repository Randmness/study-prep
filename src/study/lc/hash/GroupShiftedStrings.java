package study.lc.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupShiftedStrings {

    public List<List<String>> groupStrings(String[] strings) {
        HashMap<Integer, List<String>> map = new HashMap<>();

        for (String word: strings) {
            int length = word.length();
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList());
            }

            map.get(length).add(word);
        }

        return new ArrayList(map.values());
    }
}
