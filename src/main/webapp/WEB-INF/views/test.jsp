<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	test2
	<a href="/">홈으로</a> <br>
	
	<form action="/formPostEx" method="post">
	아이디 : <input type="text" name="user_id"> <br>
	비번 : <input type="password" name="user_pw"> <br>
	<input type="submit" value="전송">
	</form>
</body>
</html>