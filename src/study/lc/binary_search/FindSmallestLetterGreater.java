package study.lc.binary_search;

public class FindSmallestLetterGreater {

    public char nextGreatestLetter(char[] letters, char target) {
        boolean[] seen = new boolean[26];

        for (char c: letters) {
            seen[c-'a'] = true;
        }

        while(true) {
            target++;

            if (target > 'z') target = 'a';
            if (seen[target-'a']) return target;
        }
    }
}
