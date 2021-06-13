package study.lc.binary_search;

public class GuessNumber {

    //https://leetcode.com/problems/guess-number-higher-or-lower/
    int guess(int num) {
        return 0;
    };

    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */

    public int guessNumber(int n) {
        int start = 1, end = n;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int guess = guess(middle);

            //guess matches
            if (guess == 0) return middle;

            //guess is higher
            if (guess == -1) end = middle-1;

            //guess is lower
            if (guess == 1) start = middle+1;

        }

        return -1;
    }
}
