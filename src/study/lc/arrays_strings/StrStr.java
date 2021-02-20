package study.lc.arrays_strings;

public class StrStr {

    public int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();

        for (int start = 0; start < n - L + 1; ++start) {
            if (haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        int L = needle.length();
        int n = haystack.length();

        for (int start = 0; start < n - L + 1; ++start) {
            if (matches(haystack, needle, start)) {
                return start;
            }
        }
        return -1;
    }

    private boolean matches(String haystack, String needle, int start) {
        int needleStart  = 0;
        while (needleStart < needle.length()) {
            if (haystack.charAt(start+needleStart) != needle.charAt(needleStart++)) return false;
        }

        return true;
    }
}
