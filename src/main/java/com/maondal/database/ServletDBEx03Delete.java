package com.maondal.database;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

@WebServlet("/db/ex03Delete")
public class ServletDBEx03Delete extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 삭제
		// DELETE FROM `new_user` WHERE `id` = 1;   Id 기반이다
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		String deleteQuery = "DELETE FROM `new_user` WHERE `id` = " + id;
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		mysqlService.update(deleteQuery);
		
		response.sendRedirect("/db/ex03.jsp");
		
		
		
		
		
		
	}
}
