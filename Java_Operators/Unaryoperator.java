public class Unaryoperator {

    public static void main(String[] args) {
        int number = 5;
        boolean flag = true;


System.out.println("same number = " + (+number)); //5
System.out.println("number depend on the sign of number = " + (-number)); //-5
System.out.println("flag = " + (!flag)); //false
System.out.println(Integer.toBinaryString(number)); //101
 int result = ~number;
 System.out.println(Integer.toBinaryString(result)); //11111111111111111111111111111010
 System.out.println(Integer.bitCount(result));
 int maskClear = 0b000000000000000000000000000000000001010;
 int Anding= result & maskClear;
    System.out.println(Integer.toBinaryString(Anding)); //10



    }
    
}
