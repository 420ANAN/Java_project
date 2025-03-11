public class LabelExample {
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Use nested loops with labels to control the flow
        outerLoop: // Label for the outer loop
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 5) {
                    // Break out of the outer loop when element is 5
                    break outerLoop;
                }
                // Print each element
                System.out.print(element + " ");
            }
            // Print a new line after each row
            System.out.println();
        }
    }
}
