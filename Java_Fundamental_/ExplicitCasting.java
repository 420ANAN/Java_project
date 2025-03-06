public class ExplicitCasting {
    public static void main(String[] args) {
        double doubleValue = 100.04;
        int intValue = (int)doubleValue; //in this case, we have to specify the type of the variable we are casting to,in this case int and then put the variable we are casting in bracket
        float floatValue = (float)doubleValue;

        System.out.println("intValue:"+intValue);
        System.out.println("floatValue:"+floatValue);

    }
}
