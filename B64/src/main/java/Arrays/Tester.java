package Arrays;

import java.util.Collections;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusinessLogic.process(2, "phil", 27, "IT", 50000);
		BusinessLogic.process(7, "james", 20, "IT", 40000);
		BusinessLogic.process(10, "william", 33, "Sales", 70000);
		BusinessLogic.process(4, "kevin", 24, "HR", 100000);
		
		System.out.println();
		
		BusinessLogic.show();
		
		BusinessLogic.sort();
		
		System.out.println();
		
		BusinessLogic.show();
		
	}

}
