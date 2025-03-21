package Ineritance_Type;

public class ObjectCounting {

    private static int count = 0;

    public ObjectCounting() {
        count++;
    }

    public static void main(String[] args) {
        ObjectCounting obj1 = new ObjectCounting();
        ObjectCounting obj2 = new ObjectCounting();
        ObjectCounting obj3 = new ObjectCounting();

        System.out.println("Number of objects created: " + count);
    }
    
}
