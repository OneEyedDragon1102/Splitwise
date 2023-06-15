package com.splitwise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
	private String jdbcURL = "jdbc:mysql://localhost:3306/userm?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "thisismysql";
	
	// get connection method
	private Connection getConnection() {
		Connection connection = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		return connection;
	}
	
	// insert new User
	public void insertNewUser() throws SQLException {
		try(Connection connection = getConnection();){
//			PreparedStatement pStatement = 
		}
	}
	
}
