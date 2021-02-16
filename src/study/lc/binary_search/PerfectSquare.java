package study.lc.binary_search;

public class PerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num < 2)  return true;

        long start = 2, end = num;
        while (start <= end) {
            long middle = start + (end - start)/2;
            long guess = middle*middle;

            if (guess == num) return true;
            if (guess > num) end = middle-1;
            if (guess < num) start = middle+1;

        }

        return false;
    }
}
