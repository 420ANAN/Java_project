public class Bitwiseoperator {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        int andResult = a & b;  // 0001 in binary, which is 1
        System.out.println("a & b = " + andResult);

        // Bitwise OR
        int orResult = a | b;  // 0111 in binary, which is 7
        System.out.println("a | b = " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b;  // 0110 in binary, which is 6
        System.out.println("a ^ b = " + xorResult);

        // Bitwise NOT
        int notResult = ~a;  // 1010 in binary (two's complement), which is -6
        System.out.println(Integer.toBinaryString(notResult));  // 101 in binary
        System.out.println("~a = " + notResult);

        // Bitwise left shift
        int leftShiftResult = a << 1;  // 1010 in binary, which is 10
        System.out.println("a << 1 = " + leftShiftResult);

        // Bitwise right shift
        int rightShiftResult = a >> 1;  // 0010 in binary, which is 2
        System.out.println("a >> 1 = " + rightShiftResult);
    }
}
