public class ContinueExample {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // If the number is even, skip the rest of the loop iteration
            if (i % 2 == 0) {
                continue;
            }
            // Print the number if it is odd
            System.out.println("Number: " + i);
        }
    }
}
