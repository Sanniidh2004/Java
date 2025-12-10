class Car{

	String brand;
	String color;
	int speed;

void displayDetails(){
	System.out.println("Brand: " +brand);
	System.out.println("Color: " +color);
	System.out.println("Speed: " + speed + "km/h");
   }

void accelerate(int increment){
	speed+= increment;
	System.out.println("The car accelerated. New speed: speed + "km/h");
   }
}

public class Main{
	public static void main(String[]args){
	Car myCar = new Car();
	Car anotherCar = new Car();

	myCar.brand = "Toyota";
	myCar.color = "Red";
	myCar.speed = 50;

        anotherCar.brand = "Maruti";
	anotherCar.color = "Blue";
	anotheCar.speed = 80;


	System.out.println("Car Details:");
	myCar.displayDetails();
	anotherCar.displayDetails();

   System.out.println("\nAccelerating the car...");
   myCar.accelerate(20);
   anotherCar.accelerate(10);
  }
}

