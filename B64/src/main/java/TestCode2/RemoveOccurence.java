package TestCode2;

import java.util.Scanner;

public class RemoveOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		
		s1 = s.nextLine();
		
		System.out.print("Enter the a character: ");
		
		String c = s.nextLine();
		
		s1 = s1.replace(c, "");
		
		System.out.println(s1);
	}

}
