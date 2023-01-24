package TestCode1;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		
		s1 = s.nextLine();
		
		System.out.print("Enter the second string: ");
		
		s2 = s.nextLine();
		
		check(s1,s2);
	}
	
	static void check(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() == s2.length()) {
			
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			if(Arrays.equals(charArray1, charArray2)) {
				System.out.println("They are anagrams");
			}
			else {
				System.out.println("They are not anagrams");
			}
		}
		else {
			System.out.println("They are not anagrams");
		}
	}

}
