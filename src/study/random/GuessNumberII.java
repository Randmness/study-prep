package study.random;

public class GuessNumberII {

    //https://leetcode.com/problems/guess-number-higher-or-lower-ii/
    public int getMoneyAmount(int n) {
        if (n == 1) return 0;

        int[][] results = new int[n+1][n+1];
        return dp(results, 1, n);
    }

    private int dp(int[][] table, int start, int end) {
        if (start>= end) return 0;

        if (table[start][end] != 0) return table[start][end];

        int result = Integer.MAX_VALUE;
        for (int x = start; x <= end; x++) {
            int tmp = x + Math.max(dp(table, start, x-1), dp(table, x+1, end));
            result = Math.min(result, tmp);
        }

        table[start][end] = result;
        return result;
    }
}
