package TestCode3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertJDBC {

	public static void main(String[] args) {
		Employee myEmployee = new Employee(101, "Allen", "IT", 102.5f);
		
		if(insertData(myEmployee)!= 0) {
			System.out.println("Data inserted.");
		}
		else {
			System.out.println("Problem with query.");
		}
	}
		
	public static int insertData(Employee emp) {
		Connection conn = null;
		
		try {
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " not found");
		}
		
		try {
			// Open the Connection
			conn=DriverManager
					.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", 
							"root", "root");
			
			// Issue the query
			PreparedStatement pStatement = conn.
					prepareStatement("insert into employee values(?,?,?,?)");
			pStatement.setInt(1, emp.getId());
			pStatement.setString(2, emp.getName());
			pStatement.setString(3, emp.getDepartment());
			pStatement.setFloat(4, emp.getSalary());
			
			// Execute the query
			return pStatement.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println("error: " + e.getMessage());
			
			return 0;
		}
		finally {
			// Close the connection
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
