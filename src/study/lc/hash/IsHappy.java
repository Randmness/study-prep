package study.lc.hash;

import java.util.HashSet;

public class IsHappy {

    public boolean isHappy(int n) {
        HashSet<Integer> unique = new HashSet<>();
        while (n != 1 && !unique.contains(n)) {
            unique.add(n);
            n = digitMath(n);
        }

        return n == 1;
    }

    private int digitMath(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += (digit * digit);
        }

        return sum;
    }

}
