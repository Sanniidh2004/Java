public class Rectangle {
    // Data members (instance variables)
    private double length;
    private double width;

    // Constructor to initialize the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
 public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(10.0, 5.0);

        // Calculate and display the area and perimeter
System.out.println("Name: Sannidhi Deb");
System.out.println("Roll No: 2330044");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
