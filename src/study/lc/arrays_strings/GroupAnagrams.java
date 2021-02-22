package study.lc.arrays_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();
        for (String word: strs) {
            String wordValue = getValue(word);
            if (!results.containsKey(wordValue)) {
                results.put(wordValue, new ArrayList());
            }
            results.get(wordValue).add(word);
        }

        return new ArrayList(results.values());
    }

    private String getValue(String word) {
        if (word == null || word.length() == 0) {
            return "";
        }

        int[] letterCount = new int['z'-'a'+1];
        for (char letter : word.toCharArray()) {
            letterCount[letter-'a']++;
        }

        StringBuilder wordKey = new StringBuilder();
        for (int number: letterCount) {
            wordKey.append("-");
            wordKey.append(number);
        }

        return wordKey.toString();
    }
}
