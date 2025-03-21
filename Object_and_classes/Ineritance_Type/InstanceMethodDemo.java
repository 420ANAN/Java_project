package Ineritance_Type;

public class InstanceMethodDemo {
    private String message = "Hello, this is an instance method!";

    // Instance method
    public void displayMessage() {
        System.out.println(message);
    }

    // New method to update the message
    public void updateMessage(String newMessage) {
        message = newMessage;
    }

    public static void main(String[] args) {
        InstanceMethodDemo demo = new InstanceMethodDemo();
        demo.displayMessage(); // Calling the instance method

        // Updating the message using the new method
        demo.updateMessage("This is the updated instance method message!");
        demo.displayMessage(); // Displaying the updated message
    }
}
