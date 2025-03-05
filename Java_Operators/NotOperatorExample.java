public class NotOperatorExample {
    public static void main(String[] args) {
        
        // Logical NOT example
        boolean boolValue = true;
        boolean logicalNotResult = !boolValue;
        System.out.println("Logical NOT of " + boolValue + " is " + logicalNotResult);

        // Bitwise NOT example
        int intValue = 5;  // 0101 in binary
        int bitwiseNotResult = ~intValue;  // 1010 in binary (two's complement), which is -6
        System.out.println("Bitwise NOT of " + intValue + " is " + bitwiseNotResult);
    }
}
