import java.util.ArrayList;
import java.util.List;

public class ForEachProgram {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Use a for-each loop to iterate through the list
        for (String fruit : fruits) {
            // Print each fruit
            System.out.println("Fruit: " + fruit);
        }
    }
}
