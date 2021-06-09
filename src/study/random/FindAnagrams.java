package study.random;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> results = new ArrayList<>();
        boolean[] contains = new boolean['a'-'z'+1];
        for (char letter: p.toCharArray()) {
            contains[letter-'a'] = true;
        }

        int position = 0;
        while (position <= s.length()-p.length()) {
            if (contains[s.charAt(position)-'a']) {
                if (isPermutation(p, s.substring(position, position+p.length())))
                    results.add(position);
            }

            position++;
        }

        return results;
    }

    private boolean isPermutation(String s1, String s2) {
        int[] letterCount = new int['z'-'a'+1];

        for (char letter: s1.toCharArray()) {
            letterCount[letter-'a']++;
        }

        for (char letter: s2.toCharArray()) {
            if (letterCount[letter-'a'] < 1) return false;
            letterCount[letter-'a']--;
        }

        for (int count: letterCount) {
            if (count != 0) return false;
        }

        return true;
    }
}
