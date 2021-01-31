package study.CTCI.ch1_strings;

import java.util.Locale;

public class DuplicatesInString {


    public static void main(String[] args) {
        System.out.println("Has dupes: " + hasDuplicates("   ", false));
    }



    private static boolean hasDuplicates(String text, boolean caseSensitive) {

        if (text == null || text.length() <= 1) {
            return false;
        }

        if (caseSensitive) {
            text = text.toLowerCase(Locale.ROOT);
        }

        boolean[] duplicates = new boolean[128];
        for (char character: text.toCharArray()) {
            if (duplicates[character]) {
                System.out.println("Dupe found: " + character);
                return true;
            } else {
                duplicates[character] = true;
            }
        }

        return false;
    }
}
