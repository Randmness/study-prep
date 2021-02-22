package study.lc.arrays_strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    //PWWKEW = 3 (WKE OR KEW)
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet<>();
        int max = 0, left = 0, right = 0;
        while (right < s.length()) {
            char letter = s.charAt(right);
            while (unique.contains(letter)) {
                unique.remove(s.charAt(left++));
            }
            unique.add(letter);
            max = Math.max(max, right-left+1);
            right++;
        }

        return max;
    }
}
