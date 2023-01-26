package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;
import com.demo.utility.DBConnection;

public class EmployeeDaoImp1 implements EmployeeDao{
	
	public void save(Employee e) {
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into employeeb64 values(?,?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getDept());
			ps.setFloat(4, e.getSalary());
				
			int x = ps.executeUpdate();
				
			if(x!=0) {
				System.out.println("Data inserted successfully");
			}
			else {
				System.out.println("Couldnt insert the data");
			}
		}
		catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
		
	}

	@Override
	public List<Employee> fetch() {
		Connection conn = DBConnection.getConnection();
		List<Employee> emp = new ArrayList<Employee>(); 
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from employeeb64");
			
			while (result.next()){
				Employee e = new Employee();
				e.setId(result.getInt(1));
			    e.setName( result.getString(2));
			    e.setDept(result.getString(3));
			    e.setSalary(result.getFloat(4));
			    emp.add(e);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return emp;
	}

	@Override
	public void update(Employee e) {
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement statement = conn.prepareStatement("update employeeb64 set name=?, dept=?, salary=? where id=?");
			statement.setString(1, e.getName());
			statement.setString(2, e.getDept());
			statement.setFloat(3, e.getSalary());
			statement.setInt(4, e.getId());
			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated != 0) {
			    System.out.println("An existing user was updated successfully!");
			}
			else {
				System.out.println("Couldnt update the data");
			}
		}
		catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
		
	}

	@Override
	public void delete(Employee e) {
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement statement = conn.prepareStatement("delete from employeeb64 where id=?");
			statement.setInt(1, e.getId());
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted != 0) {
			    System.out.println("A user was deleted successfully!");
			}
			else {
				System.out.println("Couldnt delete the data");
			}
		}
		catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	
	
}
