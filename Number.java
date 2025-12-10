import java.util.Scanner;

// Define the Complex class
class Complex {
    private double x, y;

    // No-argument constructor
    Complex() {
        x = y = 0.0;
    }

    // Parameterized constructor
    Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to accept a complex number
    void acceptComplexNumber() {
System.out.println("\nName: Sannidhi Deb");
System.out.println("Roll No: 2330044");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter real part (x): ");
        x = scanner.nextDouble();
        System.out.print("Enter imaginary part (y): ");
        y = scanner.nextDouble();
    }
 // Method to display a complex number
    void displayComplexNumber() {
        System.out.println(x + " + " + y + "i");
    }

    // Method to add two complex numbers
    Complex addComplexNumbers(Complex other) {
        return new Complex(x + other.x, y + other.y);
    }

    // Method to multiply two complex numbers
    Complex multiplyComplexNumbers(Complex other) {
        return new Complex(x * other.x - y * other.y, x * other.y + y * other.x);
    }
}

public class Number {
    public static void main(String[] args) {
        Complex complex1 = new Complex();
        Complex complex2 = new Complex();

        System.out.println("Enter first complex number:");
        complex1.acceptComplexNumber();
        System.out.println("Enter second complex number:");
        complex2.acceptComplexNumber();

        System.out.println("\nFirst complex number:");
        complex1.displayComplexNumber();
        System.out.println("Second complex number:");
        complex2.displayComplexNumber();

        Complex sum = complex1.addComplexNumbers(complex2);
        System.out.println("\nSum of complex numbers:");
        sum.displayComplexNumber();

        Complex product = complex1.multiplyComplexNumbers(complex2);
        System.out.println("\nProduct of complex numbers:");
        product.displayComplexNumber();
    }
}


