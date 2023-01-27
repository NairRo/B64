package TestCode2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedBrackets {
	
	static boolean checker(String s1) {
		Deque<Character> stack= new ArrayDeque<Character>();
		int checker = 0;
	    for (int i = 0; i < s1.length(); i++) {
	        char x = s1.charAt(i);
	
	        if (x == '(' || x == '[' || x == '{') {
	            stack.push(x);
	            continue;
	        }
	        
		    if(stack.isEmpty()) {
		    	return false;
		    }
		    
		    char check;
		    switch(x) {
		    	case ')':
		    		check = stack.pop();
		    		if(check != '(') {
		    			return false; 
		    		}
		    		break;
		    	case ']':
		    		check = stack.pop();
		    		if(check != '[') {
		    			return false; 
		    		}
		    		break;
		    	case '}':
		    		check = stack.pop();
		    		if(check != '{') {
		    			return false;
		    		}
		    		break;
		    }
	    }
	    
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a set of brackets: ");
		
		s1 = s.nextLine();
		
		if(checker(s1)) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}
}
