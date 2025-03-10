public class IterateMultiDimensionalArray {
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Use nested for-each loops to iterate through the 2D array
        for (int[] row : matrix) {
           
                System.out.print( row + " ");
           
        }
    }
}
