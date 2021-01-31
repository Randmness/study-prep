package study.ch1_strings;

public class TwoStringsOneUpdateAway {

    public static void main(String[] args) {
        System.out.println("One insert away: " + oneInsert("abdef", "abcefg"));
    }

    private static boolean oneInsert(String text1, String text2) {
        //Error checking on nulls

        if (text1.length() == text2.length()) {
            return checkEqualLength(text1, text2);
        } else if (text1.length() - text2.length() == 1) {
            //add one to text2 to match
            return checkUnequalLength(text2, text1);
        } else if (text1.length() - text2.length() == -1) {
            //add one to text1 to match
            return checkUnequalLength(text1, text2);
        }

        return false;
    }

    private static boolean checkEqualLength(String text1, String text2) {
        boolean changeNeeded = false;

        for (int index=0; index<text1.length(); index++) {
            if (text1.charAt(index) != text2.charAt(index)) {
                if (changeNeeded) {
                    return false;
                } else {
                    changeNeeded = true;
                }
            }
        }

        return true;
    }

    private static boolean checkUnequalLength(String text1, String text2) {
        int text1Index = 0;
        int text2Index = 0;

        while (text1Index < text1.length() && text2Index < text2.length()) {
            if (text1.charAt(text1Index) != text2.charAt(text2Index)) {
                if (text1Index != text2Index) {
                    return false;
                }

                text2Index++;
            } else {
                text1Index++;
                text2Index++;
            }
        }

        return true;
    }


}
