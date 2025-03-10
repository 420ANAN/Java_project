import java.util.Scanner;

public class SubtractionWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the difference
        int difference = num1 - num2;

        // Print the result
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        // Close the scanner
        scanner.close();
    }
}
