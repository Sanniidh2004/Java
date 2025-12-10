class Person {
void name (){
System.out.println (" Name is Sannidhi Deb " );
} }
class Student extends Person {
void roll(){
System.out.println (" Roll is 2330044 " );
} }
class SecondYear extends Student {
void year(){
System.out.println (" 2nd year  " );
} }
class Multiinheritance {
public static void main ( String args []) {
SecondYear stud = new SecondYear ();
stud.year();
stud.roll();
stud.name();
}}