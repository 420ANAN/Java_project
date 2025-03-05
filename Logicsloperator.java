public class Logicsloperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Logical AND
        boolean andResult = (a > 0) && (b >0);
        System.out.println("a > 0 && b > 0 = " + andResult);

        // Logical OR
        boolean orResult = (a > 0) || (b > 0);
        System.out.println("a > 0 || b > 0 = " + orResult);

        // Logical NOT
        boolean notResult = !(a > 0);
        System.out.println("!(a > 0) = " + notResult);

    }
    
}
