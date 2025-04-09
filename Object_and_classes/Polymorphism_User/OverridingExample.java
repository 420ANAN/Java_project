package Polymorphism_User;

class Vehicle {
    // Base class
    public void move() {
        System.out.println("The vehicle is moving.");

    }

    public double getSpeed() {
        return 0.0; // Default speed

    }

}


class Car extends Vehicle {
    // Overriding the move method
    @Override
    public void move() {
        System.out.println("The car is moving on the road.");
    }

    // Overriding the getSpeed method
    @Override
    public double getSpeed() {
        return 60.0; // Speed in km/h
    }
}


public class OverridingExample {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.move(); // Calls the base class method
        System.out.println("Speed: " + myVehicle.getSpeed() + " km/h");

        Vehicle myCar = new Car(); // Upcasting
        myCar.move(); // Calls the overridden method in Car class
        System.out.println("Speed: " + myCar.getSpeed() + " km/h"); // Calls the overridden method in Car class
    }

    
}
