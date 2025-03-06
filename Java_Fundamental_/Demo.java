package Java_Fundamental_;

public  class Demo {
     public static int staticVariable = 0;


    public void increment(){
        staticVariable++;

    }

    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.increment();
        System.out.println("Static variable after object obj1.increment: "+Demo.staticVariable);
        obj2.increment();
        System.out.println("Static variable after object obj1.increment: "+Demo.staticVariable);
    }
}

