public class IterateMultiDimensionalArray {
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Use nested for-each loops to iterate through the 2D array
        for (int[] row : matrix) { //row as a iteration variable is a 1D array
            for (int element : row) { //element as a iteration variable is an integer
                // Print each element
                System.out.print(element + " ");
            }
            // Print a new line after each row
            System.out.println();
        }
    }
}
