public class LeftShift {
    public static void main(String[] args) {
        int number = 102;  //Binary representation in 8 bits is 0000 1000


        //Left shift by 1 bit
        int result1 = number <<1; //binary representation of 8 after left shift by 1 bit 
        // Left shift by 2 bits
        int result2 = number <<2; //binary representation of 8 after left shift by 2 bits
        //Left shift by 3 bits
        int result3 = number <<3;

       System.out.println("Result of left shift by 1 bit: "+result1); //204
         System.out.println("Result of left shift by 2 bits: "+result2); //408
            System.out.println("Result of left shift by 3 bits: "+result3); //816


            System.out.println("Binary representation of 102: "+Integer.toBinaryString(result1)); //1100110
            System.out.println("Binary representation of 102: "+Integer.toBinaryString(result2)); //11001100
            System.out.println("Binary representation of 102: "+Integer.toBinaryString(result3)); //110011000
    }     

}
