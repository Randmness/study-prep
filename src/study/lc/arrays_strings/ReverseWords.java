package study.lc.arrays_strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public String reverseWords(String s) {
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public String reverseWordsTwo(String s) {
        char[] sArray = s.toCharArray();

        int lastSpace = 0;
        for (int i = 0; i<= s.length(); i++) {
            if (i == s.length() || sArray[i] == ' ') {
                for (int j = 0; j < (i-lastSpace)/2; j++) {
                        char tmp = sArray[j+lastSpace];
                        sArray[j+lastSpace] = sArray[i-1-j];
                        sArray[i-1-j] = tmp;
                }

                lastSpace = i+1;
            }
        }

        return String.valueOf(sArray);
    }
}
