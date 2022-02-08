<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>anniversary</title>
</head>
<body>
	<h2>오늘부터 1일</h2><br>
	
	<%
		Calendar todayCalender = Calendar.getInstance();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		String dateString = formatter.format(todayCalender.getTime());
		todayCalender.add(Calendar.DATE, 100 - 1);
		
		int anni = 100;
		
		for(int i = 1; i <= 10; i++){
			todayCalender.add(Calendar.DATE, 100);
			out.println("<br>" + formatter.format(todayCalender.getTime())); 
		}
		
		
	%>
	

</body>
</html>