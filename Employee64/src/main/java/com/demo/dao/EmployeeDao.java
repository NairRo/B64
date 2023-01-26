package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {
	
	public void save(Employee e);
	
	public List<Employee> fetch();
	
	public void delete(Employee e);
	
	public void update(Employee e);
	
}
