package study.strings;

public class IsSubstringRotation {

    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = randomGeneration(n);
        printMatrix(matrix);

        nullifyMatrix(matrix);
        printMatrix(matrix);
    }

    private static void nullifyMatrix(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];

        for (int row=0; row< matrix.length; row++) {
            for (int column = 0; column<matrix[0].length; column++) {
                if (matrix[row][column] == 0) {
                    rows[row] = true;
                    columns[column] = true;
                }
            }
        }

        for (int row=0; row<rows.length; row++) {
            if (rows[row]) {
                nullifyRow(matrix, row);
            }
        }

        for (int column=0; column<columns.length; column++) {
            if (columns[column]) {
                nullifyColumn(matrix, column);
            }
        }
    }

    private static void nullifyColumn(int[][] matrix, int column) {
        for (int row=0; row < matrix.length; row++) {
            matrix[row][column] = 0;
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int column=0; column < matrix[0].length; column++) {
            matrix[row][column] = 0;
        }
    }

    private static int[][] randomGeneration(int n) {
        int[][] matrix = new int[n][n];
        for (int row=0; row<n; row++) {
            for (int column=0; column<n; column++) {
                matrix[row][column] = (int)(Math.random()*(5-0));
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("\n\nMatrix Printout:");
        for (int row=0; row<matrix.length; row++) {
            for (int column=0; column<matrix.length; column++) {
                System.out.print("["+matrix[row][column]+"]");
            }
            System.out.println("");
        }
    }
}
