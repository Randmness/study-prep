package study.lc.arrays_strings;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestString {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet<>();
        int maxSequence = 0, i = 0, j = 0;

        while(i < s.length() && j < s.length()) {
            if (!unique.contains(s.charAt(j))) {
                unique.add(s.charAt(j++));
                maxSequence = Math.max(maxSequence, j-i);
            } else {
                unique.remove(s.charAt(i++));
            }
        }

        return maxSequence;
    }

}
