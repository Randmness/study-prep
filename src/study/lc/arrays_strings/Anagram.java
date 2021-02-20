package study.lc.arrays_strings;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] counts = new int['z'-'a'+1];

        for (char letter:s.toCharArray()) {
            counts[letter-'a']++;
        }

        //O(1)
        for (char letter: t.toCharArray()) {
            counts[letter-'a']--;
            if (counts[letter-'a'] < 0) return false;
        }

        return true;
    }
}
