package TestCode1;

import java.util.Scanner;

public class SwapNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		System.out.print("Enter the first integer: ");
		
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		
		System.out.print("Enter the second integer: ");
		
		num2 = s.nextInt();
		
		System.out.println("The first number is " + num1 + ". The second number is " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Now the first number is " + num1 + ". The second number is " + num2);
	}	

}
