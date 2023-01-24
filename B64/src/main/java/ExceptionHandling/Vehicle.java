package ExceptionHandling;

public class Vehicle {
	
	int num = 4;
	
	void process() {
		int tirePressures[] = {98,99,97,99};
		try {
			System.out.println("Processing tire pressures.....");
			System.out.println("Tire pressure of "+ num + " is " + tirePressures[num]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error occured, the tire num is wrong");
			System.out.println("------------------------------------");
			System.out.println("Changing tire number to 1");
			num = 1;
		}
		catch(Exception e) {
			System.out.println("Error Occured: " + e.getMessage());
		}
		finally {
			System.out.println("Processing done.");
			System.out.println("------------------------------------");
		}
	}
}
