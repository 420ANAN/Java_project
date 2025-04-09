package Polymorphism_User;

class Calculator{
    
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(double a, double b) {
        return (int) (a + b);
    }
    
    public String add(String a, String b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calling the add method with different parameters
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3)); // Calls int version
        System.out.println("Sum of 2, 3 and 4: " + calc.add(2, 3, 4)); // Calls int version with three parameters
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5)); // Calls double version
        System.out.println("Concatenation of 'Hello' and 'World': " + calc.add("Hello", " World")); // Calls String version
    }
    
}
