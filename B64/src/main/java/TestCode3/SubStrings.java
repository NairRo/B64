package TestCode3;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		
		System.out.print("Enter String: ");
		
		Scanner s = new Scanner(System.in);
		s1 = s.nextLine();
		
		int n = s1.length();
		for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point. 
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(s1.charAt(k));
                }
 
                System.out.println();
            }
        }
	}

}
