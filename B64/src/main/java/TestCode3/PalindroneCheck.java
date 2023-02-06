package TestCode3;

import java.util.Scanner;

public class PalindroneCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		
		System.out.print("Enter String: ");
		
		Scanner s = new Scanner(System.in);
		s1 = s.nextLine();
		
		String rev = "";
		
		for(int i = s1.length()-1; i > -1; i--) {
			rev += s1.charAt(i);
		}

		if(s1.equals(rev)) {
			System.out.println("Palindrone");
		}
		else {
			System.out.println("No");
		}
	}

}
