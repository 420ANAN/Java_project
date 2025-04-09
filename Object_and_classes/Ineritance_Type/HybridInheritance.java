package Ineritance_Type;

interface Animal{
    default void eat() {
        System.out.println("This animal eats food.");
    }
}

interface Mammal extends Animal{
    default void eat() {
        System.out.println("This mammal can eat food.");
    }
}

interface Bird extends Animal{
    default void eat() {
        System.out.println("This bird can eat food.");
    }
}

class Bat implements Mammal, Bird {
    @Override
    public void eat() {
        Mammal.super.eat(); // Calls the eat method from Mammal
        Bird.super.eat(); // Calls the eat method from Bird
        System.out.println("The bat can eat food.");
    }
    
}

public class HybridInheritance {

    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat(); // Calls the eat method from Bat, which in turn calls the eat methods from Mammal and Bird
    }
    
}
