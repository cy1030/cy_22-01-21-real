<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.marondal.common.MysqlService" %>    
<%@ page import="java.sql.ResultSet" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 리스트</title>
</head>
<body>
	
	<%
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "SELECT * FROM `new_user`";
		ResultSet resultSet = mysqlService.select(query);
	
	%>
	
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>생년월일</th>
				<th>자기소개</th>
				<th>이메일</th>
				
			</tr>
		
		</thead>
		<tbody>
			<% while(resultSet.next()) { %>
			<tr>
				<td><%= resultSet.getInt("id") %></td>
				<td><%= resultSet.getString("name") %></td>
				<td><%= resultSet.getString("yyyymmdd") %></td>
				<td><%= resultSet.getString("introduce") %></td>
				<td><%= resultSet.getString("email") %></td>
				<td><a href="db/ex03Delete?id= "></a></td>
				
			</tr>
			<% } %>
			<tr>
				<td>2</td>
				<td>김바다</td>
				<td>20022222</td>
				<td>안녕하세요!</td>
				<td>lecture2@naver.com</td>
				
			</tr>
		
		</tbody>	
	
	</table>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>