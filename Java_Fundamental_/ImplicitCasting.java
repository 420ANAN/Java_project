public class ImplicitCasting {
    public static void main(String[] args) {
        int intValue = 100;
        long longValue = intValue; //implicit casting from int to long 
        float floatValue = longValue; //implcit casting from long to float 
        double doubleValue = floatValue; //implicit casting from float to double 
       
     System.out.println("intValue:"+ intValue);
     System.out.println("floatValue:"+ floatValue);
     System.out.println("doubleValue:"+doubleValue);

    }


}
