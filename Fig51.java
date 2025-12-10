class UniversityMember {
    String name;
    String gender;
        void message(){
System.out.println("Name: Sannidhi Deb");
System.out.println("Roll number: 2330044");}

    UniversityMember(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    void display_name_and_gender() {
        System.out.println("Name: " + name + ", Gender: " + gender);
    }
}

class Student extends UniversityMember {
    String course;
    String branch;
Student(String name, String gender, String course, String branch) {
        super(name, gender); // Call the parent class constructor
        this.course = course;
        this.branch = branch;
    }

    void display_course_and_branch() {
        System.out.println("Course: " + course + ", Branch: " + branch);
    }
}

class Year extends Student {
    String yearID;
    int semID;
    double SGPA;
    Year(String name, String gender, String course, String branch, String yearID, int semID, double SGPA) {
        super(name, gender, course, branch); // Call the parent class constructor
        this.yearID = yearID;
        this.semID = semID;
        this.SGPA = SGPA;
    }
    void display_year_details() {
        System.out.println("Year ID: " + yearID + ", Semester ID: " + semID + ", SGPA: " + SGPA);
    }
}

public class Fig51 {
    public static void main(String[] args) {
        
        Year studentYear = new Year("Sannidhi Deb", "Female", "BTech", "ECSc", "2nd", 4, 8.89);
studentYear.message();
        studentYear.display_name_and_gender();
        studentYear.display_course_and_branch();
        studentYear.display_year_details();
    }
}
