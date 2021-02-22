package study.lc.arrays_strings;

public class MatrixZeroes {

    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                if (matrix[row][column] == 0) {
                    rows[row] = true;
                    columns[column] = true;
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                if (rows[row] || columns[column]) matrix[row][column] = 0;
            }
        }
    }
}
