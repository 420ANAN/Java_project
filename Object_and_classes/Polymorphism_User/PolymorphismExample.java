package Polymorphism_User;

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method from Animal class(Runtime polymorphism)
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
    
    // Overloading the makeSound method (Compile-time polymorphism)
    void makeSound(String mood){
        if (mood.equals("happy")) {
            System.out.println("Woof! Woof!");
        } else if (mood.equals("angry")) {
            System.out.println("Grrr! Woof!");
        } else {
            System.out.println("Woof!");
        }

    }
    
}

public class PolymorphismExample {
    public static void main(String[] args) {
        //Runtime polymorphism
        Animal myDog = new Animal(); 
        myDog.makeSound(); // Calls the overridden method in Dog class

        //Compile-time polymorphism
        Dog dog = new Dog();
        dog.makeSound(); // Calls the overridden method in Dog class
        dog.makeSound(); // Calls the overloaded method with "happy" argument
    }
    
}
