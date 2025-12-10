class Rectangle {
int height ;
int width ;
Rectangle () {
height = 0; width = 0;
}
void display () {
System . out . println (" Width : " + width );
System . out . println (" Height : " + height );
}

}
class Defconstruct {

public static void main ( String args []) {

// creating an object
Rectangle rec = new Rectangle ();
rec . display ();

}

}