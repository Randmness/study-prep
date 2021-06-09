package study.lc.arrays_strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AtMostTwoDistinct {

    /**
     * https://leetcode.com/explore/interview/card/google/59/array-and-strings/3054/
     */
    public int lengthOfLongestSubstringTwoDistinct(String s) {

        if (s.length() <= 2) return s.length();

        Map<Character, Integer> uniqueChars = new HashMap<>();
        int left = 0, right = 0;

        int maxLength = 0;
        while (right < s.length()) {
            Character letter = s.charAt(right);
            if (uniqueChars.containsKey(letter)) {
                //add 1
                uniqueChars.put(letter, uniqueChars.get(letter)+1);
            } else {
                //insert
                uniqueChars.put(letter, 1);

                while(uniqueChars.size() > 2) {
                    Character leftChar = s.charAt(left++);
                    uniqueChars.put(leftChar, uniqueChars.get(leftChar)-1);

                    if (uniqueChars.get(leftChar) == 0) uniqueChars.remove(leftChar);
                }
            }
            maxLength = Math.max(maxLength, ++right - left);
        }

        return maxLength;
    }

    public int lengthOfLongestSubstringTwoDistinctTwo(String s) {
        if (s.length() <= 2) return s.length();

        Map<Character, Integer> uniqueChars = new HashMap<>();
        int left = 0, right = 0;

        int maxLength = 0;
        while (right < s.length()) {
            Character letter = s.charAt(right);
            uniqueChars.put(letter, right);

            if (uniqueChars.size() == 3) {
                int leftMost = Collections.min(uniqueChars.values());
                left = leftMost + 1;
                uniqueChars.remove(s.charAt(leftMost));
            }

            maxLength = Math.max(maxLength, ++right - left);
        }

        return maxLength;
    }
}
