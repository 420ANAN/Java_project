package Ineritance_Type;

public class FormattedString {
    public static void main(String[] args) {
         String name =  "John";
         int age = 25;
         double salary = 50000.50;
            String formattedString = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
            System.out.println(formattedString);


            // Using System.out.printf() for formatted output
            System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);
    }
    
}
