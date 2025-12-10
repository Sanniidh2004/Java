class SecondYear {
    void message() {
System.out.println("Name: Sannidhi Deb");
System.out.println("Roll number: 2330044");
     System.out.println("Welcome to Second Year!");
    }
}


class SecondSem extends SecondYear {
    void subjects() {
    System.out.println("6 theory courses and 2 lab courses");
    }
}

public class week3qn12 {
    public static void main(String[] args) {
        SecondSem secondSem = new SecondSem();
        secondSem.message(); 
        secondSem.subjects(); 
    }
}

