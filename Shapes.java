import java.util.Scanner;
class Shapes{
	String name;
	static class Square{
	int side;
	int sqArea(){
	return side*side;
  }
}
static class Rectangle{
	int width;
	int height;
	int recArea(){
	return width*height;
  }
}

public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter shape name:");	
	String str = sc.nextLine();
	Shape sh = new Shape();
	sh.name = str;
	if(sh.name.equals("Square")|| sh.name.equals("square")){
		Square sq = new Square();
		System.out.print("Enter the side of square: ");
		System.out.print("Area of square: " +sq.sqArea());
}
	else if(sh.name.equals("Rectangle")||sh.name.equals("rectangle")){
		Rectangle rec = new Rectangle();
		System.out.print("Enter width:");
		rec.width = sc.nextInt();
		System.out.print("Enter height:");
		rec.height = sc.nextInt();
		System.out.print("Area of rectangle: " +rec.recArea());
  }
else{
	System.out.println("Invalid shape entered!");
          }
        }
   }
		

	