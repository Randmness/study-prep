package study.lc.arrays_strings;

import java.util.ArrayList;
import java.util.List;

public class MyAtoi {

    public int myAtoi(String s) {
        if (s == null || s.trim().length() == 0) return 0;

        char[] trimmedString = s.trim().toCharArray();
        int nonDigits = 0;
        for (Character letter: trimmedString) {
            if (!Character.isDigit(letter)) {
                if (letter != '-' && letter != '+') return 0;
                nonDigits++;
            } else {
                break;
            }
            if (nonDigits > 1) return 0;
        }

        boolean positive = (trimmedString[0] == '-')? false: true;
        List<Character> numbers = new ArrayList<>();
        for (Character letter: trimmedString) {
            if (Character.isDigit(letter)){
                numbers.add(letter);
            }  else if (!numbers.isEmpty()) break;
        }

        double amount = 0;
        for(Character number: numbers) {
            amount = amount * 10 + Character.getNumericValue(number);
        }

        amount = positive? amount: amount * -1;

        return (int) amount;
    }
}
