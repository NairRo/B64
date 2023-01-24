package Arrays;

public class Employee {
	private int id;
	private String name;
	private Integer age;
	private String dept;
	private double salary;
	
	Employee(int id, String name, Integer age, String dept, double salary){
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	
	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee name: " + name + " age: " + age;
	}
	
}
