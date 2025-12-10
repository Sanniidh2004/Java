import java.util.Scanner;

// Define the Triangle class
class Triangle {
    private double a, b, c;

    // No-argument constructor
    Triangle() {
        a = b = c = 0.0;
    }

    // Parameterized constructor
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
 // Method to accept the sides of a triangle
    void acceptSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a: ");
        a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        b = scanner.nextDouble();
        System.out.print("Enter side c: ");
        c = scanner.nextDouble();
    }

    // Method to display the sides of a triangle
    void displaySides() {
        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Side c: " + c);
    }

    // Method to check the type of triangle
    void checkTriangleType() {
        if (a == b && b == c) {
            System.out.println("The triangle is equilateral.");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles.");
        } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("The triangle is right-angled.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}

public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.acceptSides();
        System.out.println("\nTriangle Sides:");
        triangle.displaySides();
        System.out.println("\nTriangle Type:");
        triangle.checkTriangleType();
    }
}

