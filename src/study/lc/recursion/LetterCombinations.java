package study.lc.recursion;

import java.util.*;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (digits == null || digits.length() == 0) return results;

        Map<Character, List<String>> mapping = new HashMap<>();
        mapping.put('2', Arrays.asList("a", "b", "c"));
        mapping.put('3', Arrays.asList("d", "e", "f"));
        mapping.put('4', Arrays.asList("g", "h", "i"));
        mapping.put('5', Arrays.asList("j", "k", "l"));
        mapping.put('6', Arrays.asList("m", "n", "o"));
        mapping.put('7', Arrays.asList("p", "q", "r", "s"));
        mapping.put('8', Arrays.asList("t", "u", "v"));
        mapping.put('9', Arrays.asList("w", "x", "y", "z"));

        results.add("");

        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            for (String result: results) {
                for (String letter : mapping.get(digit)) {
                    temp.add(result + letter);
                }
            }
            results = temp;
        }

        return results;
    }
}
