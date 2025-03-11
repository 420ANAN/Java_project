public class ReturnExample {
    public static void main(String[] args) {
        int result = calculateSum(5, 10);
        System.out.println("The sum is: " + result);

        // Example of early return
        System.out.println("Checking number:");
        checkNumber(5);
        checkNumber(-1);
    }

    // Method to calculate the sum of two numbers
    public static int calculateSum(int a, int b) {
        return a + b; // Return the sum of a and b
    }

    // Method to check if a number is positive
    public static void checkNumber(int num) {
        if (num < 0) {
            System.out.println("Number is negative, exiting method.");
            return; // Early return if the number is negative
        }
        System.out.println("Number is positive.");
    }
}
