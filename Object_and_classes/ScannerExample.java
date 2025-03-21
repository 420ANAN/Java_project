import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console
        //new identifier of the scanner class is used for dynamic memory allocation
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        // Read the integer input from the user
        int inputInt1 = scanner.nextInt();
        int inputInt2 = scanner.nextInt();

        System.out.println( inputInt1 + inputInt2+ " is the sum of the two numbers");
       
        // Close the scanner
        scanner.close();
    }
}
