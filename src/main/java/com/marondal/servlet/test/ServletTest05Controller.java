package com.marondal.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz05")
public class ServletTest05Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String gugudan = request.getParameter("number");
		int gugu = Integer.parseInt(gugudan);
		
		out.println("<html><head><title>get 메소드</title></head>");
		out.println("<body>");
		out.println("<ul>");
		
		for(int i = 1; i < 10; i++) {
			out.println("<li>"+ gugu + " * " + i + " = " + (gugu * i)+"</li>");
		}
		out.println("</ul>");
		out.println("</body></html>");
		
	
		
		
		
		
	}
}
