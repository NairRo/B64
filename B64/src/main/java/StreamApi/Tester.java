package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = Arrays.asList(new Employee(3,"James", 41, "HR", 54321), new Employee(11,"Allan", 23, "IT", 12345), 
				new Employee(7,"Jack", 29, "Sales", 23451), new Employee(19,"Lucy", 20, "IT", 11234), new Employee(9,"Alex", 33, "HR", 32145));
		
		System.out.println(list);
		
		List<Employee> result = list.stream().sorted((o1, o2)->o1.getAge().compareTo(o2.getAge())).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
