public class Condition_for {
    static boolean done;
    // Declares a static boolean variable 'done' which is shared among all instances of the class.

    public static boolean interpreted() {
        // Defines a static method 'interpreted' that returns a boolean value.
        int randomValue = (int) (Math.random() * 10); 
        // Generates a random integer between 0 and 9.
        return randomValue > 7; 
        // Returns true if the random integer is greater than 7, otherwise returns false.
    }

    public static void main(String[] args) {
        // Defines the main method, the entry point of the program.
        System.out.println("Starting loop...");
        // Prints "Starting loop..." to the console.

        for (int i = 0; !done; i++) {
            // Starts a for loop with an integer variable 'i' initialized to 0.
            // The loop continues as long as 'done' is false.
            System.out.println("Iteration: " + i);
            // Prints the current iteration number to the console.
            if (interpreted()) {
                // Calls the 'interpreted' method.
                done = true;
                // Sets 'done' to true if 'interpreted' returns true.
                System.out.println("Condition met, exiting loop.");
                // Prints "Condition met, exiting loop." to the console.
            }
        }

        System.out.println("Loop ended.");
        // Prints "Loop ended." to the console after the loop exits.
    }
}