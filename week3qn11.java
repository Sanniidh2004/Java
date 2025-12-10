class Person{
void gender(){
System.out.println("Name: Sannidhi Deb");
System.out.println("Roll number: 2330044");
System.out.println("Gender is Female");
}   }
class Student extends Person{
void branch(){
System.out.println("Branch is ECSc");
}    }
class week3qn11{
public static void main(String args[]){
Student stud = new Student();
stud.gender();
stud.branch();
}}