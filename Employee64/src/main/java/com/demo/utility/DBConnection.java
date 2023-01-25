package com.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection conn = null;
	
	@SuppressWarnings("finally")
	static public Connection getConnection() {
		
		String dURL = "jdbc:mysql://localhost:3306/batch64?useSSL=false";
		String username = "root";
		String psswd = "Greatr2n35";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			conn = DriverManager.getConnection(dURL, username, psswd);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			return conn;
		}
	}
}
