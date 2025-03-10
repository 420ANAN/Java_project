import java.util.Scanner;

public class ComplexProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();

        // Calculate the factorial
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Print the factorial result
        System.out.println("The factorial of " + num + " is: " + factorial);

        // Check if the factorial result is a prime number
        boolean isPrime = true;
        if (factorial <= 1) {
            isPrime = false;
        } else {
            for (long j = 2; j <= Math.sqrt(factorial); j++) {
                if (factorial % j == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print whether the factorial result is prime or not
        System.out.println("The factorial of " + num + " is " + (isPrime ? "a prime number" : "not a prime number"));

        // Close the scanner
        scanner.close();
    }
}
