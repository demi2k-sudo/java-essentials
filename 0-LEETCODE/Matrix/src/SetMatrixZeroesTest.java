public class SetMatrixZeroesTest {
    // Function to modify the matrix
    public void setZeroes(int[][] matrix) {
        // Mark elements to be set to zero
        for (int i = 0; i < matrix.length; i++) 
            for (int j = 0; j < matrix[0].length; j++) 
                if (matrix[i][j] == 9999) matrix[i][j] = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix.length; k++) if (matrix[k][j] != 0) matrix[k][j] =  9999;
                    for (int k = 0; k < matrix[i].length; k++) if (matrix[i][k] != 0) matrix[i][k] =  9999;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) 
            for (int j = 0; j < matrix[0].length; j++) 
                if (matrix[i][j] == 9999) matrix[i][j] = 0;
    }

    // Helper function to print the matrix
    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        SetMatrixZeroesTest test = new SetMatrixZeroesTest();

        // Example matrix with zeros
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        test.printMatrix(matrix);

        // Call the function to set zeroes
        test.setZeroes(matrix);

        System.out.println("\nMatrix After setZeroes:");
        test.printMatrix(matrix);
    }
}
