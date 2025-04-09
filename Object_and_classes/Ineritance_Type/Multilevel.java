package Ineritance_Type;
// Multilevel inheritance example in Java
// In this example, we have three classes: Animal, Mammal, and Dog.
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("Mammal is walking");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}



public class Multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Create an object of the Dog class
        dog.eat(); // Call method from Animal class
        dog.walk(); // Call method from Mammal class
        dog.bark(); // Call method from Dog class
    }
    
}
