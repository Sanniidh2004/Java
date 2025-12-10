class Student {
    String name;
    int roll;
	void message(){
     System.out.println("Sannidhi Deb");
        System.out.println("2330044");
    }
    Student() {
        name = "Sannidhi Deb";
        roll = 2330044;
    }

    
    void info() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class FirstSem extends Student {
    double SGPA;

   
    FirstSem() {
        SGPA = 8.88;
    }

        void info() {
        super.info();
        System.out.println("First Sem SGPA: " + SGPA);
    }
}
class SecondSem extends Student {
    double SGPA;

        SecondSem() {
        SGPA = 8.68;
    }

   
    void info() {
        super.info();
        System.out.println("Second Sem SGPA: " + SGPA);
    }
}

class ThirdSem extends Student {
    double SGPA;

    
    ThirdSem() {
        SGPA = 8.9;
    }
      
       void info() {
        super.info();
        System.out.println("Third Sem SGPA: " + SGPA);
    }
}

public class SGPAinfo {
    public static void main(String[] args) {
        FirstSem firstSem = new FirstSem();
        SecondSem secondSem = new SecondSem();
        ThirdSem thirdSem = new ThirdSem();

        System.out.println("First Semester Details:");
        firstSem.message();
        firstSem.info();
        System.out.println("\nSecond Semester Details:");
        secondSem.info();
        System.out.println("\nThird Semester Details:");
        thirdSem.info();
       
}
}