package study.CTCI.ch1_strings;

public class PermutationOfPalindrome {

    public static void main(String[] args) {
        System.out.println("Permutation: " + permutationOfPalindrome("abcbabb"));
    }

    private static boolean permutationOfPalindrome(String text) {

        int[] characterCount = new int[Character.getNumericValue('z')-Character.getNumericValue('a')];

        for (char character: text.toCharArray()) {
            if (character >= 'a' && character <= 'z') {
                characterCount[character-'a']++;
            }
        }

        boolean oddEncountered = false;
        for (int count: characterCount) {
            if (count % 2 == 1) {
                if (oddEncountered) {
                    //second time odd
                    return false;
                } else {
                    oddEncountered = true;
                }
            }
        }

        return true;
    }
}
