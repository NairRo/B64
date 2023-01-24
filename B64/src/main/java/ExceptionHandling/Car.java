package ExceptionHandling;

public class Car extends Vehicle{
	
	int speed = 0;
	
	void perform() {
		try {
			int time = 100/speed;
			System.out.println("The car will travel 100 units in " + time + "s");
		}
		catch(ArithmeticException  e) {
			System.out.println("There something wrong with speed.....maybe increasing it would help");
			System.out.println("------------------------------------");
			speed = speed + 10;
			System.out.println("The speed of the car is " + speed);
			System.out.println("------------------------------------");
		}
	}
}
