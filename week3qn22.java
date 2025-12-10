class Person {
void gender() {
System.out.println("Name: Sannidhi Deb");
System.out.println("Roll number: 2330044");
System.out.println("Gender is Female");
    }
}

class Student extends Person {
    
}


class SecondYear extends Student {
    void year2() {
        System.out.println("2nd year...");
    }
}

class ThirdYear extends Student {
    void year3() {
        System.out.println("3rd year...");
}
}

class FourthYear extends Student {
    void year4() {
        System.out.println("4th year...");
    }
}

public class week3qn22 {
    public static void main(String[] args) {
        SecondYear secondYear = new SecondYear();
        secondYear.gender();
        secondYear.year2();

        ThirdYear thirdYear = new ThirdYear();
       
        thirdYear.year3();

        FourthYear fourthYear = new FourthYear();
       
        fourthYear.year4();
    }
}