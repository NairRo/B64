package TestCode1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		
		System.out.print("Enter a integer: ");
		
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		
		if(num1%2 == 0) {
			System.out.println("The number even");
		}
		else {
			System.out.println("The first number odd");
		}
	}

}
