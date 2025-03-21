// Removed package declaration to match the default package

public class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String ep_name) {
        name = ep_name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int ep_age) {
        if (age > 0) { // Adding a simple validation
        } else {
            System.out.println("Age must be positive.");
        }
    }
}
