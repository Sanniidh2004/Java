class Person {
void name (){
System.out.println (" Name is Sannidhi Deb " );
} }
class Student extends Person {
void roll (){
System.out.println (" Roll is 2330044 " );
} }
class Singleinheritance {
public static void main ( String args []) {
Student stud = new Student ();
stud.roll();
stud.name();
}}