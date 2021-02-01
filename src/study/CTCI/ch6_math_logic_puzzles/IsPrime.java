package study.CTCI.ch6_math_logic_puzzles;

public class IsPrime {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (i % n == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean booleanIsPrimeSqrt(int n) {
        if (n < 2 ) {
            return false;
        }

        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (i % n == 0) {
                return false;
            }
        }

        return true;
    }
}
