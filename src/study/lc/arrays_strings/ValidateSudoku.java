package study.lc.arrays_strings;

import java.util.HashMap;
import java.util.Map;

public class ValidateSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Integer>[] rows = new HashMap[9];
        Map<Integer, Integer>[] columns = new HashMap[9];
        Map<Integer, Integer>[] boxes = new HashMap[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }

        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                if (Character.isDigit(board[rowIndex][columnIndex])) {
                    int digit = board[rowIndex][columnIndex];
                    int box = (rowIndex / 3 ) * 3 + columnIndex / 3;

                    if (rows[rowIndex].containsKey(digit)) return false;
                    else rows[rowIndex].put(digit, 0);

                    if (columns[columnIndex].containsKey(digit)) return false;
                    else columns[columnIndex].put(digit, 0);

                    if (boxes[box].containsKey(digit)) return false;
                    else boxes[box].put(digit, 0);
                }
            }
        }

        return true;
    }
}
