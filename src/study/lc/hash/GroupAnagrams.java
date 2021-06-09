package study.lc.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> results = new HashMap<>();
        for (String word: strs) {
            String wordValue = getValue(word);
            if (!results.containsKey(wordValue)) {
                results.put(wordValue, new ArrayList<>());
            }

            results.get(wordValue).add(word);
        }

        return new ArrayList<>(results.values());
    }

    private String getValue(String word) {
        if (word == null || word.length() == 0) {
            return "";
        }

        char[] wordArray = word.toCharArray();
        Arrays.sort(wordArray);

        return String.valueOf(wordArray);
    }
}
