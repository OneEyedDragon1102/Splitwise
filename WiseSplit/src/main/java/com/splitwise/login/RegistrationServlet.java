package com.splitwise.login;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String nameString = request.getParameter("name");
		String emailString = request.getParameter("email");
		String passwordString = request.getParameter("password");
		String contactString = request.getParameter("contact");
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/splitwise?useSSL=false", "root", "thisismysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sqlString = "INSERT INTO users(name, email, password, contact) VALUES (?, ?, ?, ?)";
		try (PreparedStatement pStatement = connection.prepareStatement(sqlString)){
			pStatement.setString(1, nameString);
			pStatement.setString(2, emailString);
			pStatement.setString(3, passwordString);
			pStatement.setString(4, contactString);
			
			pStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
	        connection.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		
		response.sendRedirect("splitwise.html");
	}
}
