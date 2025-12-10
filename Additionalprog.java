// Outer class named OuterClass
class OuterClass {
    String message = "Hello from the Outer Class!";

    // Inner class
    class InnerClass {
        String innerMessage = "Hello from the Inner Class!";

        // Method in the inner class
        void displayMessages() {
            // Access outer class member
            System.out.println(message);
            // Access inner class member
            System.out.println(innerMessage);
        }
    }
}

public class Additionalprog {
    public static void main(String[] args) {
        // Create an object of the outer class
        OuterClass outer = new OuterClass();

        // Create an object of the inner class using the outer class object
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Call the method in the inner class
        inner.displayMessages();
    }
}