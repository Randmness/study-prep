package study.CTCI.ch1_strings_arrays;

public class RotateMatrix {

    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = randomGeneration(n);
        printMatrix(matrix);

        rotateMatrix(matrix);
        printMatrix(matrix);
    }

    private static void rotateMatrix(int[][] matrix) {

        for (int layer=0; layer<matrix.length/2; layer++) {
            int last = matrix.length -1 - layer;

            int offset=0;
            for (int position = layer; position <last; position++, offset++) {
                int temp = matrix[layer][position];

                //left -> top
                matrix[layer][position] = matrix[last-offset][layer];

                //bottom -> left
                matrix[last-offset][layer] = matrix[last][last-offset];

                //right -> bottom
                matrix[last][last-offset] = matrix[position][last];

                //top -> right
                matrix[position][last] = temp;
            }
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
