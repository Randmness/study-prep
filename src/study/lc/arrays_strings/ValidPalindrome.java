package study.lc.arrays_strings;

import java.util.Locale;

public class ValidPalindrome {

    //spaces and ascii values. only letters matter
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            boolean isLeftLetter = Character.isLetterOrDigit(s.charAt(left));
            boolean isRightLetter = Character.isLetterOrDigit(s.charAt(right));

            if (!isLeftLetter || !isRightLetter) {
                if (!isLeftLetter) left++;
                if (!isRightLetter) right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) !=
                        Character.toLowerCase(s.charAt(right))) return false;
                left++;
                right--;
            }
        }

        return true;

    }

    //canDelete one letter
    // abca -> true

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                //havent removed any removing one makes middle
                if (right-1 == left) return true;

                return (isPalindromeCheck(s.substring(left+1, right+1)) ||
                        isPalindromeCheck(s.substring(left, right)));
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    public boolean isPalindromeCheck(String s) {
        int position = 0;
        while (position < s.length()) {
            if (s.charAt(position) != s.charAt(s.length()-1-position)) return false;
            position++;
        }

        return true;
    }
}
