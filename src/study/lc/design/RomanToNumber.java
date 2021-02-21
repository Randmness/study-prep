package study.lc.design;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {

    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int number = 0;
        char[] array = s.toCharArray();
        int position = array.length-1;

        while (position >= 0) {
            Character numeral = array[position];
            int temp = roman.get(numeral);
            if (position > 0) {
                if (roman.get(array[position-1]) < roman.get(numeral)) {
                    temp -= roman.get(array[position-1]);
                    position--;
                }
            }

            number += temp;
            position--;
        }

        return number;
    }
}
