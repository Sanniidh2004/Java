class Student {
    String name;
    int roll;
void message(){
System.out.println("Name: Sannidhi Deb");
System.out.println("Roll number: 2330044");
}

     Student() {
        this.name = "John Doe";
        this.roll = 1234;
    }


    void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.roll);
    }
}


class FirstSem extends Student {
    double SGPA;

  
    FirstSem() {
super();
        this.SGPA = 8.5;
    }

    void info() {
        super.info(); 
        System.out.println("SGPA (First Sem): " + this.SGPA);
    }
}


class SecondSem extends Student {
    double SGPA;

    SecondSem() {
        super(); 
        this.SGPA = 9.0;
    }


    void info() {
 super.info();
        System.out.println("SGPA (Second Sem): " + this.SGPA);
    }
}

class ThirdSem extends Student {
    double SGPA;

    ThirdSem() {
        super();        
         this.SGPA = 8.8;
    }

    
    void info() {
        super.info(); 
        System.out.println("SGPA (Third Sem): " + this.SGPA);
    }
}


public class student {
    public static void main(String[] args) {
        FirstSem firstSem = new FirstSem();
firstSem.message();
        firstSem.info();

        System.out.println();

        SecondSem secondSem = new SecondSem();
        secondSem.info();

        System.out.println();

        ThirdSem thirdSem = new ThirdSem();
        thirdSem.info();
    }
}
