package com.maondal.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

@WebServlet("/db/ex03Insert")
public class ServletDBEx03Insert extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String introduce = request.getParameter("introduce");
		String email = request.getParameter("email");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String insertQuery = "INSERT INTO `new_user`\r\n"
				+ "(`name`,`yyyymmdd`,`email`,`introduce`,`createdAT`,`updatedAT`)"
				+ "VALUES\r\n"
				+ "('" + name + "', '" + yyyymmdd + "', '" + email + "', '" + introduce + "', now(), now())";
				
		
		PrintWriter out = response.getWriter();
		
	 
		
		
		
	}
}
