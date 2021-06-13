package study.lc.arrays_strings;

public class LongestPalindromeInString {

    //https://leetcode.com/explore/featured/card/google/64/dynamic-programming-4/451/
    //O(n2) time, O(1) space
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int oddLength = checkFromCenter(s, i, i);
            int evenLength = checkFromCenter(s, i, i+1);
            int max = Math.max(oddLength, evenLength);

            if (max > end-start) {
                start = i - (max-1)/2;
                end = i + max/2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int checkFromCenter(String s, int left, int right) {
        while (left >= 0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right-left-1;
    }
}
