package study.random;

import java.util.HashSet;
import java.util.Set;

public class MinWindowOfSubstring {

    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        String response = "";
        int left = 0, right = 1;
        Set<Character> unique = new HashSet<>();
        for (Character letter: t.toCharArray()) {
            unique.add(letter);
        }

        while (right < s.length()) {
            String subst = s.substring(left, right);
            if (partialMatch(subst, unique)) {
                if (contains(subst, t)) {
                    if (response.length() ==0 || subst.length() < response.length()) {
                        response = subst;
                    }

                    while (left != right) {
                        left++;
                    }
                    right++;
                } else {
                    right++;
                }
            } else {
                left++;
                right++;
            }
        }

        return response;
    }

    private boolean partialMatch(String subst, Set<Character> unique) {
        for (char letter: subst.toCharArray()) {
            if (unique.contains(letter)) return true;
        }
        return false;
    }

    private boolean contains(String subst, String t) {
        if (subst == null || subst.length() == 0) return false;

        int[] subLetters = new int[128];
        for (char letter : subst.toCharArray()) {
            subLetters[letter]++;
        }

        for (char letter: t.toCharArray()) {
            subLetters[letter]--;
            if (subLetters[letter] < 0) return false;
        }

        return true;
    }
}
