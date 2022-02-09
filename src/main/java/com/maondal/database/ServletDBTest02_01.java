package com.maondal.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

public class ServletDBTest02_01 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String insertQuery = "INSERT INTO `favorite`\r\n"
				+ "(`name`,`url`,`createdAT`,`updatedAT`)\r\n"
				+ "VALUES\r\n"
				+ "('마론달', 'http://marondal.com', now(), now())"
				+ "('구글', 'https://google.com', now(), now())"
				+ "('네이버', 'https://naver.com', now(), now())"
				+ "('다음', 'https://daum.net', now(), now())";
		
		
		
		
		
		
	}
}
