package TestCode3;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		
		s1 = s.nextLine();
		System.out.println( "Initial String : "+ s1);
      
	    s1 = s1.replaceAll( s1 , "Replaced" );
	    System.out.println( "The String after substitution : "+s1 );
	}

}
