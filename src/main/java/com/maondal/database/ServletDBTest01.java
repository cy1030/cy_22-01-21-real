package com.maondal.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDBTest01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		try {
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/test_db0107";
			String userId = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, userId, password);
			Statement statement = connection.createStatement();
			
			String selectQuery = "SELECT * FROM `real_estate`";
			ResultSet resultSet = statement.executeQuery(selectQuery);
			
			String insertQuery = "INSERT INTO `real_estate`\r\n"
					+ "(`realtorId`,`address`,`area`, `type`, `price`, `rentPrice`, `createdAT`, `updatedAT`)"
					+ "VALUES\r\n"
					+ "(3, '헤라펠리스 101동 5305호', 350,'매매', 1500000	, NULL, now(), now())";
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
