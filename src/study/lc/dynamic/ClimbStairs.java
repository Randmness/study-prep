package study.lc.dynamic;

import java.util.Arrays;

public class ClimbStairs {


    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return climbStairs(n, memo);
    }

    //O(n) with memo, O(2^n) without
    public int climbStairs(int n, int[] memo) {
        if (n < 3) return n;

        if (memo[n] > -1) {
            return memo[n];
        }

        memo[n] = climbStairs(n-1, memo) + climbStairs(n-2, memo);
        return memo[n];
    }

    public int climbStairsFib(int n) {
        if (n < 3) return n;

        int first = 1;
        int second = 2;

        for (int count = 3; count <= n; count++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }

}
