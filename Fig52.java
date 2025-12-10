class UniversityMember {
    String name;
    String gender;
    

    UniversityMember(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
void message(){
System.out.println("Name: Sannidhi Deb");
System.out.println("Roll number: 2330044");
}
    void display_name_and_gender() {
        System.out.println("Name: " + name + ", Gender: " + gender);
    }
}

class Student extends UniversityMember {
    String course;
    String branch;
    Student(String name, String gender, String course, String branch) {
  super(name, gender); 
        this.course = course;
        this.branch = branch;
    }

    void display_course_and_branch() {
        System.out.println("Course: " + course + ", Branch: " + branch);
    }
}

class Employee extends UniversityMember {
    int employeeID;
    Employee(String name, String gender, int employeeID) {
        super(name, gender); 
        this.employeeID = employeeID;
    }

    void display_employeeID() {
        System.out.println("Employee ID: " + employeeID);
    }
}

class Teaching extends Employee { 

    String designation;
    Teaching(String name, String gender, int employeeID, String designation) {
        super(name, gender, employeeID); 
        this.designation = designation;
    }

    void display_designation() {
        System.out.println("Designation: " + designation);
    }
}

class NonTeaching extends Employee {
    String designation;

    NonTeaching(String name, String gender, int employeeID, String designation) {
        super(name, gender, employeeID);
        this.designation = designation;
    }

    void display_designation() {
        System.out.println("Designation: " + designation);  }
}

class Year {
    String yearID;
    int semID;
    int rollNumber;
    double SGPA;
    Year(String yearID, int semID, int rollNumber, double SGPA) {
        this.yearID = yearID;
        this.semID = semID;
        this.rollNumber = rollNumber;
        this.SGPA = SGPA;
    }

    void display_year_details() {
        System.out.println("Year ID: " + yearID + ", Semester ID: " + semID + ", Roll Number: " + rollNumber + ", SGPA: " + SGPA);
    }
}
public class Fig52 {
    public static void main(String[] args) {

        Student student = new Student("Sannidhi Deb", "Female", "BTech", "ECSc");
student.message();
        student.display_name_and_gender();
        student.display_course_and_branch();

        Employee employee = new Employee("Susmit Gupta", "Male", 210054);
        employee.display_name_and_gender();
        employee.display_employeeID();

        Teaching teaching = new Teaching("Vimal Shrivastava", "Male", 56789, "Professor");
        teaching.display_name_and_gender();
        teaching.display_employeeID();
        teaching.display_designation();

        NonTeaching nonTeaching = new NonTeaching("Sarthak", "Male", 98765, "Lab Assistant");
        nonTeaching.display_name_and_gender();
        nonTeaching.display_employeeID();
        nonTeaching.display_designation();

        Year year = new Year("2nd", 4, 2330044, 8.8);
        year.display_year_details();
    }
}

