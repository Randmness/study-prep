package study.lc.arrays_strings;

public class RotateImage {

    /**
     * [123]        [147]       [741]
     * [456]    =>  [258]   =>  [852]
     * [789]        [369]       [963]
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
    }

    private void transpose(int[][] matrix) {
        int length = matrix.length;

        for (int rows=0; rows < length; rows++) {
            for (int columns = rows; columns < length; columns++) {
                int temp = matrix[columns][rows];
                matrix[columns][rows] = matrix[rows][columns];
                matrix[rows][columns] = temp;
            }
        }
    }


    private void reverseRows(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows ++) {
            int left = 0, right = matrix.length-1;
            while (left < right) {
                int tmp = matrix[rows][left];
                matrix[rows][left++] = matrix[rows][right];
                matrix[rows][right--] = tmp;

            }
        }
    }
}
