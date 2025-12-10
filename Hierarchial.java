class Person {
void name (){
System.out.println (" Name is Sannidhi Deb " );
} }
class Student extends Person {
void roll (){
System.out.println (" Roll is 2330044 " );
} }
class Teacher extends Person {
void empid (){
System.out.println (" ID is 2330059  " );
} }
class Hierarchial {
public static void main ( String args []) {
Teacher t = new Teacher ();
t.empid();
t.name();
}}