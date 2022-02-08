package com.maondal.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

@WebServlet("/db/ex01")
public class ServletDBEx01 extends HttpServlet {
	
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
			
			// 중고물품리스트 가져오기
			String selectQuery = "SElECT * FROM `used_goods`";
			ResultSet resultSet = statement.executeQuery(selectQuery);
			
			while(resultSet.next()) {
				String title = resultSet.getString("title"); //컬럼이름 가져오기
				int price = resultSet.getInt("price");
				
				out.println("제품명 : " + title);
				out.println("가격 : " + price);
			}
			
			// insert 쿼리
			String insertQuery = "INSERT INTO `used_goods`\r\n"
					+ "(`sellerId`,`title`, `price`, `description`, `picture`, `createdAT`, `updatedAT`)"
					+ "VALUES\r\n"
					+ "(2, '고양이 간식팝니다', 2000,'저희 고양이가 까다로워 안먹어요', NULL, now(), now())";
			
			// 리턴 결과는 실행된 행의 갯수
			int count = statement.executeUpdate(insertQuery);
			
			out.println("삽입 : " + count);
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// MysqlService mysqlService = new MysqlService();
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		
		
	}
}
