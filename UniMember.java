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

public class UniMember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
 Student student = new Student();
        System.out.println("Enter Student Details:");
        System.out.print("Name: Sannidhi Deb ");
        String studentName = scanner.nextLine();
        System.out.print("Gender: Female ");
        String studentGender = scanner.nextLine();
        System.out.print("Roll Number: 2330044 ");
        String studentRollNumber = scanner.nextLine();
        student.enterStudentDetails(studentName, studentGender, studentRollNumber);

        
        Faculty faculty = new Faculty();
        System.out.println("\nEnter Faculty Details:");
        System.out.print("Name: Dr.Vimal Shrivastava ");
        String facultyName = scanner.nextLine();
        System.out.print("Gender: Male");
        String facultyGender = scanner.nextLine();
        System.out.print("Employee ID: EC20001 ");
        String facultyEmployeeId = scanner.nextLine();
        faculty.enterFacultyDetails(facultyName, facultyGender, facultyEmployeeId);

        
 System.out.println("\nStudent Details:");
        student.displayStudentDetails();
        System.out.println("\nFaculty Details:");
        faculty.displayFacultyDetails();
    }
}
