package study.lc.arrays_strings;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleBuild {

    private int getNumBuild(int row, int column, int[][] memo) {
        if (row == 0 || column == 0 || row == column) {
            memo[row][column] = 1;
        }

        if (memo[row][column] > 0) return memo[row][column];

        memo[row][column] = memo[row-1][column-1] + memo[row-1][column];
        return memo[row][column];
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();

        int[][] memo = new int[numRows+1][numRows+1];

        for (int j=1; j<= numRows; j++) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < j; i++) {
                result.add(getNumBuild(j-1, i, memo));
            }
            results.add(result);
        }

        return results;

    }
}
