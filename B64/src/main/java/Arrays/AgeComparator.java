package Arrays;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getAge().compareTo(e2.getAge());
	}
	
}
