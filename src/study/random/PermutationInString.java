package study.random;

import java.util.HashSet;
import java.util.Set;

public class PermutationInString {

    //check is s1 is contained within s2 in permutation
    public boolean checkInclusion(String s1, String s2) {

        boolean[] contains = new boolean['a'-'z'+1];
        for (char letter: s1.toCharArray()) {
            contains[letter] = true;
        }

        int position = 0;
        while (position <= s2.length()-s1.length()) {
            if (contains[s2.charAt(position)]) {
                if (isPermutation(s1, s2.substring(position, position+s1.length())))
                    return true;
            }

            position++;
        }

        return false;
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
