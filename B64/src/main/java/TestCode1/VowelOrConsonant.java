package TestCode1;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the a character: ");
		
		char c = s.next().charAt(0);
		
		switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(c + " is vowel");
            break;
        default:
            System.out.println(c + " is consonant");
    }
	}

}
