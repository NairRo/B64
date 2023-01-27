package TestCode2;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		
		s1 = s.nextLine();
		
		s1 = s1.replaceAll("\\s", "");
		 
        System.out.println(s1);
	}

}
