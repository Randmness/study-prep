package study.lc.hash;

import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqChar {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int position = 0;
        while (position < s.length()) {
            char letter = s.charAt(position++);
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        position = 0;
        while (position < s.length()) {
            char letter = s.charAt(position);
            if (map.get(letter) == 1) return position;
            position++;
        }

        return -1;
    }
}
