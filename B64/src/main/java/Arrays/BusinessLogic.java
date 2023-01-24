package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusinessLogic {
	
	static private List<Employee> l = new ArrayList<Employee>();
	
	static void process(int id, String name, int age, String dept, int salary) {
		Employee e = new Employee(id, name, age, dept, salary);
		
		l.add(e);
		
		System.out.println(e + " has been added to the array list.");
	}
	
	static void show() {
		for(Employee y: l) {
			System.out.println(y);
		}
	}
	
	static void sort() {
		Collections.sort(l, new AgeComparator());
	}
}
