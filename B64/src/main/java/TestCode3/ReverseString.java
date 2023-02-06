package TestCode3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		
		System.out.print("Enter String: ");
		
		Scanner s = new Scanner(System.in);
		s1 = s.nextLine();
		
		for(int i = s1.length()-1; i > -1; i--) {
			System.out.print(s1.charAt(i));
		}
	}
}
