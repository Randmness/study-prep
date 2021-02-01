package study.CTCI.ch8_recursion_dynamic_prog;

import java.util.Arrays;

public class TripleStep {


    public static void main(String[] args) {
        int[] memo = new int[31];
        Arrays.fill(memo, -1);

        System.out.println("Possible Ways: " + tripleStep(30));
        System.out.println("Possible Ways: " + tripleStepMemo(30, memo));
    }


    //O(3^n)
    public static int tripleStep(int n) {
        if (n < 0) return 0;
        if (n == 1) return 1;

        return tripleStep(n - 3) + tripleStep(n - 2) + tripleStep(n - 1);
    }

    public static int tripleStepMemo(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            memo[n] = tripleStepMemo(n - 3, memo) + tripleStepMemo(n - 2, memo) + tripleStepMemo(n - 1, memo);
            return memo[n];
        }
    }
}

