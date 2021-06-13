package study.random;

public class LicenseKeyFormatting {

    //https://leetcode.com/explore/featured/card/google/67/sql-2/472/
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        char[] sChars = s.toCharArray();
        int position = sChars.length-1;
        int kCount = k;
        while (position >= 0) {
            char letter = sChars[position--];
            if (Character.isLetterOrDigit(letter)) {
                if (kCount == 0) {
                    result.insert(0, '-');
                    kCount = k;
                }

                result.insert(0, Character.toUpperCase(letter));
                kCount--;
            }
        }

        return result.toString();
    }
}
