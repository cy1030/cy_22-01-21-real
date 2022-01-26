<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>계산결과</h3><br>
	
	<%
	
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	
	int num11 = Integer.parseInt(num1);
	int num22 = Integer.parseInt(num2);
	int result = 0;
	String sim = "";
	
	if(request.getParameter("solve").equals("plus")){
		result = num11 + num22;
		sim = "+";
	} else if(request.getParameter("solve").equals("minus")){
		result = num11 - num22;
		sim = "-";
	} else {
		result = num11 * num22;
		sim = "X";
	}
	
	%>
	
	<%=request.getParameter("num1") %><%=sim %>
	<%=request.getParameter("num2") %>=
	<%=result %>
	
</body>
</html>