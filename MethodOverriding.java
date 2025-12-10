class Person {
String name ;
void info (){
System . out . println (" Name is ... " + name );
} }
class Student extends Person {
int roll ;
void info (){
System . out . println (" Roll is ... " + roll );
} }
class MethodOverriding {
public static void main ( String args []) {
Student stud = new Student ();
stud . info ();
}}