package study.lc.arrays_strings;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int add = 1;
        int index = digits.length-1;
        while (add > 0 && index >= 0) {
            int number = digits[index] + add;

            if (number < 10) {
                add = 0;
            }

            digits[index] = number % 10;
            index--;
        }

        if (add > 0) {
            int[] extendedDigits = new int[digits.length+1];
            extendedDigits[0] = 1;
            index = 1;
            for (int digit: digits) {
                extendedDigits[index] = digit;
                index++;
            }
            return  extendedDigits;
        }

        return digits;
    }
}
