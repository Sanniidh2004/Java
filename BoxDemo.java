class Box {
    // Instance variables
    double length;
    double width;
    double height;

    // Method to calculate the volume
    double calculateVolume() {
        return length * width * height;
    }

    // Parameterized method to set values
    void setValues(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
 Box box1 = new Box();
        Box box2 = new Box();

        // Assign values to two objects using objects' instance-variables
        box1.length = 10.0;
        box1.width = 5.0;
        box1.height = 3.0;

        box2.length = 8.0;
        box2.width = 4.0;
        box2.height = 2.0;


System.out.println("Name: Sannidhi Deb");
System.out.println("Roll No: 2330044");
        // Get the volumes of two boxes
        System.out.println("Volume of Box 1: " + box1.calculateVolume());
        System.out.println("Volume of Box 2: " + box2.calculateVolume());
 // Set values to two objects using parameterized methods
        box1.setValues(12.0, 6.0, 4.0);
        box2.setValues(9.0, 5.0, 3.0);

        // Get the volumes of two boxes
        System.out.println("Volume of Box 1 after setting new values: " + box1.calculateVolume());
        System.out.println("Volume of Box 2 after setting new values: " + box2.calculateVolume());
    }
}
