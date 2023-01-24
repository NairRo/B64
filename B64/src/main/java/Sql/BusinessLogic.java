package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusinessLogic {
	private int id;
	String name;
	String dept;
	float salary;
	
	static String dURL = "jdbc:mysql://localhost:3306/batch64?useSSL=false";
	static String username = "root";
	static String psswd = "Greatr2n35";
	
	public BusinessLogic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessLogic(int id, String name, String dept, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public void execute(int s) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			conn = DriverManager.getConnection(dURL, username, psswd);
		    
		    switch(s) {
		    case 1:
		    	insert(conn);
		    	break;
		    case 2:
		    	select(conn);
		    	break;
		    case 3:
		    	update(conn);
		    	break;
		    case 4:
		    	delete(conn);
		    	break;
		    }
		   
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private void insert(Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement("insert into employeeb64 values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, dept);
			ps.setFloat(4, salary);
				
			int x = ps.executeUpdate();
				
			if(x!=0) {
				System.out.println("Data inserted successfully");
			}
			else {
				System.out.println("Couldnt insert the data");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void select(Connection conn) {
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from employeeb64");
			 
			while (result.next()){
				int id = result.getInt(1);
			    String name = result.getString(2);
			    String dept = result.getString(3);
			    float salary = result.getFloat(4);
			 
			    System.out.println("Id: " + id + ", name: " + name + ", dept: " + dept + ", salary: " + salary);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void update(Connection conn) {
		try {
			PreparedStatement statement = conn.prepareStatement("update employeeb64 set name=?, dept=?, salary=? where id=?");
			statement.setString(1, name);
			statement.setString(2, dept);
			statement.setFloat(3, salary);
			statement.setInt(4, id);
			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated != 0) {
			    System.out.println("An existing user was updated successfully!");
			}
			else {
				System.out.println("Couldnt update the data");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void delete(Connection conn) {
		try {
			PreparedStatement statement = conn.prepareStatement("delete from employeeb64 where id=?");
			statement.setInt(1, id);
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted != 0) {
			    System.out.println("A user was deleted successfully!");
			}
			else {
				System.out.println("Couldnt delete the data");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
