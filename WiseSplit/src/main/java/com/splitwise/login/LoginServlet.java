package com.splitwise.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String emailString = request.getParameter("email");
		String passString = request.getParameter("password");
		
		HttpSession session = request.getSession();
		RequestDispatcher requestDispatcher = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/splitwise?useSSL=false", "root", "thisismysql");
			PreparedStatement pStatement = connection.prepareStatement("SELECT* FROM users WHERE email = ? AND password = ?");
			pStatement.setString(1, emailString);
			pStatement.setString(2, passString);
			
			ResultSet rs = pStatement.executeQuery();
			if(rs.next()){
				session.setAttribute("name", rs.getString("name"));
				requestDispatcher = request.getRequestDispatcher("index.jsp");
			}
			else {
				request.setAttribute("status", "failed");
				requestDispatcher = request.getRequestDispatcher("login.jsp");
			}
			
			requestDispatcher.forward(request, response);
			
		}	
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
