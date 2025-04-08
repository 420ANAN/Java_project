package Ineritance_Type;

 class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

 class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}



public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Calling the method from the parent class
        dog.bark(); // Calling the method from the child class

    }
    
}
