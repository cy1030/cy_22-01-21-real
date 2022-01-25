package com.marondal.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class ServletTest10Controller extends HttpServlet{
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		String id = request.getParameter("Id");
		String pw = request.getParameter("Pw");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>로그인</title></head>");
		out.println("<body>");
		
		// id가 일치하지 않는 경우
		if(!id.equals(userMap.get("id"))) {
			out.println("<h3>아이디가 일치하지 않습니다");
			out.println("</body></html>");
			return;
		}
		
		// password가 일치하지 않는 경우
		if(!pw.equals(userMap.get("password"))) {
			out.println("<h3>비밀번호가 일치하지 않습니다");
			out.println("</body></html>");
			return;
		}
		
		out.println("<h3>" + userMap.get("name") + "님 환영합니다.</h3>");
		
		out.println("</body></html>");
		
	}
}
