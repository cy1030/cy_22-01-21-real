<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post method</title>
</head>
<body>

	<%
		request.setCharacterEncoding("utf-8");
		
		String[] foods = request.getParameterValues("food");
	
		String foodString = "";
		for(int i = 0; i < foodString.length(); i++){
			foodString += foods[i] + ",";
		}
		
	%>

	<table border="1">
		<tr>
			<td>별명</td>
			<td><%= request.getParameter("nickname") %></td>
		</tr>
		
		<tr>
			<td>동물</td>
			<td><%= request.getParameter("animal") %></td>
		</tr>
		
		<tr>
			<td>음식</td>
			<td><%= foodString %></td>
		</tr>
		<tr>
			<td>과일</td>
			<td><%=request.getParameter("fruit") %></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
		
		
	</table>
	
	
</body>
</html>