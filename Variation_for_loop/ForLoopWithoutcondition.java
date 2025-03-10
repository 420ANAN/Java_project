public class ForLoopWithoutcondition {
    public static void main(String[] args) {
        int i = 0; // Initialization outside the loop

        // For-loop without condition part
        for (; ; i++) {
            // Complex logic: Check if the number is prime
            boolean isPrime = true; // Assume the number is prime

            if (i <= 1) { // Numbers less than or equal to 1 are not prime
                isPrime = false;
            } else {
                // Check divisibility from 2 to the square root of the number
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) { // If divisible, it's not a prime number
                        isPrime = false;
                        break; // Exit the loop as we found a divisor
                    }
                }
            }
            // Print whether the number is prime or not
            System.out.println("i: " + i + " is " + (isPrime ? "prime" : "not prime"));
        }
        

    }
    
}
