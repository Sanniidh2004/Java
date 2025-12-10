 class Person {
    String name;
    String gender;
    int age;

    // No-argument constructor
    Person() {
        this.name = "";
        this.gender = "";
        this.age = 0;
    }

    // Parameterized constructor
    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
  System.out.println("Age: " + this.age);
    }
}

// Intermediate class
class Student extends Person {
    int rollNumber;
    String course;
    double gpa;

    // No-argument constructor
    Student() {
        super();         this.rollNumber = 0;
        this.course = "";
        this.gpa = 0.0;
    }

    // Parameterized constructor
    Student(String name, String gender, int age, int rollNumber, String course, double gpa) {
        super(name, gender, age); 
        this.rollNumber = rollNumber;
        this.course = course;
 this.gpa = gpa;
    }

    void displayStudentDetails() {
        displayPersonDetails(); // Calls the method of the Person class
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Course: " + this.course);
        System.out.println("GPA: " + this.gpa);
    }
}

// Classes that extend Student
class SecondYear extends Student {
    double secondYearGpa;
    String secondYearSubjects;
void message(){
System.out.println("Name: Sannidhi Deb");
System.out.println("Roll number: 2330044");
}

    // No-argument constructor
    SecondYear() {
        super();
        this.secondYearGpa = 0.0;
        this.secondYearSubjects = "";
    }
  SecondYear(String name, String gender, int age, int rollNumber, String course, double gpa, double secondYearGpa, String secondYearSubjects) {
        super(name, gender, age, rollNumber, course, gpa);
        this.secondYearGpa = secondYearGpa;
        this.secondYearSubjects = secondYearSubjects;
    }

    void year2() {
        System.out.println("2nd year...");
        displayStudentDetails();
        System.out.println("Second Year GPA: " + this.secondYearGpa);
        System.out.println("Second Year Subjects: " + this.secondYearSubjects);
    }
}

class ThirdYear extends Student {
    double thirdYearGpa;
    String thirdYearSubjects;

    // No-argument constructor
    ThirdYear() {
super(); 
        this.thirdYearGpa = 0.0;
        this.thirdYearSubjects = "";
    }

    // Parameterized constructor
    ThirdYear(String name, String gender, int age, int rollNumber, String course, double gpa, double thirdYearGpa, String thirdYearSubjects) {
        super(name, gender, age, rollNumber, course, gpa); 
        this.thirdYearGpa = thirdYearGpa;
        this.thirdYearSubjects = thirdYearSubjects;
    }

    void year3() {
        System.out.println("3rd year...");
        displayStudentDetails();
        System.out.println("Third Year GPA: " + this.thirdYearGpa);
        System.out.println("Third Year Subjects: " + this.thirdYearSubjects);
    }
}

class FourthYear extends Student {
    double fourthYearGpa;
    String fourthYearSubjects;

    // No-argument constructor
    FourthYear() {
        super(); 
        this.fourthYearGpa = 0.0;
        this.fourthYearSubjects = "";
    }

    // Parameterized constructor
    FourthYear(String name, String gender, int age, int rollNumber, String course, double gpa, double fourthYearGpa, String fourthYearSubjects) {
        super(name, gender, age, rollNumber, course, gpa); 
        this.fourthYearGpa = fourthYearGpa;
        this.fourthYearSubjects = fourthYearSubjects;
    }

    void year4() {
        System.out.println("4th year...");
        displayStudentDetails();
        System.out.println("Fourth Year GPA: " + this.fourthYearGpa);
        System.out.println("Fourth Year Subjects: " + this.fourthYearSubjects);
    }
}
public class week3qn3 {
    public static void main(String[] args) {
        SecondYear secondYear = new SecondYear("Sannidhi Deb", "Female", 20, 2330044, "B.Tech", 8.5, 8.8, "Electronics Engineering");
        secondYear.message();
        secondYear.year2();

        ThirdYear thirdYear = new ThirdYear("Sarthika Ghosh", "Female", 20, 123456, "B.Tech", 9.0, 9.2, "Mechanical Engineering");
        thirdYear.year3();

        // Pass the missing parameters: fourthYearGpa and fourthYearSubjects
        FourthYear fourthYear = new FourthYear("Susmit Gupta", "Male", 22, 2100054, "B.Tech", 8.8, 9.0, "Computer Science Engineering");
        fourthYear.year4();
    }
}
