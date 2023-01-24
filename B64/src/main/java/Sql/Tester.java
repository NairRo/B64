package Sql;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessLogic emp1 = new BusinessLogic(100, "Alex", "IT", 345.98f);
		BusinessLogic emp2 = new BusinessLogic(101, "James", "HR", 1045.57f);
		BusinessLogic emp3 = new BusinessLogic(102, "Mark", "IT", 553.83f);
		BusinessLogic emp4 = new BusinessLogic(103, "Drake", "Sales", 985.43f);
		
		emp1.execute(1);
		emp2.execute(1);
		emp3.execute(1);
		emp4.execute(1);
		
		emp1.execute(2);
		System.out.println("");
		System.out.println("");
		
		emp1.salary = 446.12f;
		emp1.execute(3);
		
		emp1.execute(2);
		System.out.println("");
		System.out.println("");
		
		emp1.execute(4);
		
		emp1.execute(2);
		System.out.println("");
		System.out.println("");
		
		emp2.execute(4);
		emp3.execute(4);
		emp4.execute(4);
		
		
	}

}
