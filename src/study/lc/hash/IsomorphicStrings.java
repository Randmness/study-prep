package study.lc.hash;

import java.util.HashMap;

public class IsomorphicStrings {

    //ABCD = XWYZ
    //ABCD != BABD
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        int position = 0;
        while (position < s.length()) {
            char sChar = s.charAt(position);
            char tChar = t.charAt(position);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) return false;
            } else {
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) return false;
            } else {
                tMap.put(tChar, sChar);
            }


            position++;
        }

        return true;
    }

}
