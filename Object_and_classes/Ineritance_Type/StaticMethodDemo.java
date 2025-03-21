package Ineritance_Type;

public class StaticMethodDemo {
    private String instanceVariable  = "I am an instance variable";


    //Statis method
    public static void staticMethod() {
        //System.out.println(instanceVariable);
        System.out.println("I am a static method");
    }

    //instance method
    public void instanceMethod() {
        System.out.println(instanceVariable);
        System.out.println("I am an instance method");
    }


    public static void main(String[] args) {
        //calling static method
        staticMethod();

        //calling instance method
        StaticMethodDemo obj = new StaticMethodDemo();
        obj.instanceMethod();
    }
    
}
