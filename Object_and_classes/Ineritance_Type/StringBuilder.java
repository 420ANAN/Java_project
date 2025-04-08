package Ineritance_Type;

public class StringBuilder {
    public static void main(String[] args) {
        // Create a StringBuilder object
        
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        
        // Append a string to the StringBuilder
        sb.append("Hello").append(", World!");
        
        // Convert StringBuilder to String and print it
        System.out.println(sb.toString()); // Output: Hello, World!
        
        // Insert a string at a specific index
        sb.insert(7, "Java ");
        
        // Print the modified StringBuilder
        System.out.println(sb.toString()); // Output: Hello, Java World!
        
        // Delete a portion of the string
        sb.delete(7, 12);
        
        // Print the final result
        System.out.println(sb.toString()); // Output: Hello, World!
    }
	
}
