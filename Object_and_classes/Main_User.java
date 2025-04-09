// Removed package declaration to match the default package

public class Main_User {
    public static void main(String[] args) {
        Person person = new Person();

        // Setting values using setters
        person.setName("John Doe");
        person.setAge(25);

        // Getting values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Additional use of get method
        if (person.getAge() > 18) {
            System.out.println(person.getName() + " is an adult.");
        } else {
            System.out.println(person.getName() + " is not an adult.");
        }

        // Attempting to set an invalid age
        person.setAge(-5); // This will trigger the validation in the setter
    }
}
