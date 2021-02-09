package study.lc.arrays_strings;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleBuildByRow {

    private int getNum(int row, int column, int[][] memo) {
        if (row == 0 || column == 0 || row == column) {
            return 1;
        }

        if (memo[row][column] > 0) return memo[row][column];

        memo[row][column] = getNum(row-1, column-1, memo) + getNum(row-1, column, memo);
        return memo[row][column];
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> results = new ArrayList<>();
        int[][] memo = new int[rowIndex+1][rowIndex+1];

        for (int i = 0; i <= rowIndex; i++) {
            results.add(getNum(rowIndex, i, memo));
        }

        return results;
    }
}
