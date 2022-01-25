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
			<td><%= request.getParameter("food") %></td>
		</tr>
	</table>
	
	
</body>
</html>