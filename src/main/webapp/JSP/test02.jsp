<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.text.SimpleDateFormat" %>
<%@page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜 시간 출력</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>

	<%
	Date now = new Date();
	
	// 파라미터 니가 보고 싶은게 시간인지 날짜인지 알려줘
	// type = date 날짜 보여주기
	// type = time 시간 보여주기
	String type = request.getParameter("type");
	String dateString = null;

	
	if(type.equals("date")) {
		// 날짜보여주기
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		dateString = formatter.format(now);
	}
	else if(type.equals("time")){
		// 시간보여주기
		SimpleDateFormat formatter = new SimpleDateFormat("H시 m분 s초");
		dateString = formatter.format(now);
	}
	
	%>
	
	<div class=display-2 ,name="type"><%=dateString %></div>
	
	
</body>
</html>