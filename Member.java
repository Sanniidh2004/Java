import java.util.Scanner;

class Unimember {
    protected String name;
    protected String gender;

    void enterUnimemberDetails(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    void displayUnimemberDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Unimember {
    private String rollNumber;

    void enterStudentDetails(String name, String gender, String rollNumber) {
        enterUnimemberDetails(name, gender);
        this.rollNumber = rollNumber;
    }

    void displayStudentDetails() {
        displayUnimemberDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Faculty extends Unimember {
    private String employeeId;

    void enterFacultyDetails(String name, String gender, String employeeId) {
        enterUnimemberDetails(name, gender);
        this.employeeId = employeeId;
    }

    void displayFacultyDetails() {
        displayUnimemberDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Member {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nChoose the type of member (1 for Student, 2 for Faculty): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        if (choice == 1) {
            Student student = new Student();
            System.out.println("Enter Student Details:");
            System.out.print("Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Gender: ");
            String studentGender = scanner.nextLine();
            System.out.print("Roll Number: ");
            String studentRollNumber = scanner.nextLine();
            student.enterStudentDetails(studentName, studentGender, studentRollNumber);
            
            System.out.println("\nStudent Details:");
            student.displayStudentDetails();
        } else if (choice == 2) {
            Faculty faculty = new Faculty();
            System.out.println("Enter Faculty Details:");
            System.out.print("Name: ");
            String facultyName = scanner.nextLine();
            System.out.print("Gender: ");
            String facultyGender = scanner.nextLine();
            System.out.print("Employee ID: ");
            String facultyEmployeeId = scanner.nextLine();
            faculty.enterFacultyDetails(facultyName, facultyGender, facultyEmployeeId);
            
            System.out.println("\nFaculty Details:");
            faculty.displayFacultyDetails();
        } else {
            System.out.println("Invalid choice. Please run the program again and select either 1 or 2.");
        }
    }
}
