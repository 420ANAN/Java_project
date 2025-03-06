public class BitMasking {
    public static void main(String[] args) {
        int number = 0b10101010; //Binary representaion of 170

        //mask to 5th bit( from right to 0- indexed)
        int maskSet = 0b00010000;
        int resultSet = number | maskSet;
        System.out.println("Set 5th bit: " + Integer.toBinaryString(resultSet));

        //mask to clear 6th bit
        int maskClear = 0b11011111;
        int resultClear = number & maskClear;
        System.out.println("Clear 6th bit: " + Integer.toBinaryString(resultClear));

        //mask to toggle 5th bit
        int maskToggle = 0b0010000;
        int resultToggle = number ^ maskToggle;
        System.out.println("Toggle 7th bit: " + Integer.toBinaryString(resultToggle));

    
    }
}
