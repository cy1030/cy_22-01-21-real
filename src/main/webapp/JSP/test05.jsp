<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String numString = request.getParameter("num");
		int num = Integer.parseInt(numString);
		
		String[] units = request.getParameterValues("unit");
		String result = "";
		
		for(int i = 0; i < units.length; i++){
			String unit = units[i];
			
			if(unit.equals("inch")){
				double inch = num * 0.39;
				result += inch + "in";
			
			} else if(unit.equals("yard")){
				double yard = num * 0.0109;
				result += yard + "yd";
			
			} else if(unit.equals("feet")){
				double feet = num * 0.032;
				result += feet + "ft";
			
			} 
//			else if(unit.equals("meter")){
//				double yard = num / 100.0;
		//		result += meter + "m";
		//	}
		}
		
		
	%>
	
	<h2>변환 결과</h2><br>
	<%=request.getParameter("num")%><hr>
	
	
	
	
</body>
</html>