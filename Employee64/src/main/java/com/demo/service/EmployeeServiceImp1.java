package com.demo.service;

import java.util.List;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImp1;
import com.demo.model.Employee;

public class EmployeeServiceImp1 implements EmployeeService{
	
	EmployeeDao employeeDao = new EmployeeDaoImp1();
	
	@Override
	public void save(Employee e) {
		employeeDao.save(e);
	}

	@Override
	public List<Employee> fetch() {
		return employeeDao.fetch();
	}
	
	

}
