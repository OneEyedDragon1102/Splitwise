package com.splitwise.login;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String nameString = request.getParameter("name");
		String emailString = request.getParameter("email");
		String passwordString = request.getParameter("pass");
		String contactString = request.getParameter("contact");
		
		Connection connection = null;
		RequestDispatcher dispatcher = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/splitwise?useSSl=false", "root", "thisismysql");
			PreparedStatement pStatement = connection.prepareStatement("INSERT INTO users(name, email, password, contact) VALUES(?,?,?,?) ");
			pStatement.setString(1, nameString);
			pStatement.setString(2, emailString);
			pStatement.setString(3, passwordString);
			pStatement.setString(4, contactString);
			
			int row_cnt = pStatement.executeUpdate();
			dispatcher = request.getRequestDispatcher("registration.jsp");
			if(row_cnt > 0) {
				request.setAttribute("status", "success");
			}
			else {
				request.setAttribute("status", "failed");
			}
			
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
