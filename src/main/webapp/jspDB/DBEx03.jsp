<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 추가</title>
</head>
<body>
	
	<form method="post" action="db/ex03Insert">
		<label>이름 : </label><input type="text" name="name"><br>
		<label>생년월일 : </label><input type="text" name="yyyymmdd"><br>
		<label>자기소개 : </label><br>
		<textarea rows="5" cols="50" name="introduce"></textarea>
		<label>이메일 : </label><input type="text" name="email"><br>
		<input type="submit" value="추가">
		
	</form>
</body>
</html>