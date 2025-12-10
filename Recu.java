class Rectangle {
int height ;
int width ;
void display () {
System . out . println (" Width : " + width );
System . out . println (" Height : " + height );
}

}
class Recu {

public static void main ( String args []) {

// creating an object
Rectangle rec = new Rectangle ();
rec . display ();
}
}