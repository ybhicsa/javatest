<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie</title>
	</head>
	<body>
		<%
		
			Cookie login_id = new Cookie("login_id","aaa");
			Cookie cookie_flag = new Cookie("cookie_flag","success");
			
			login_id.setMaxAge(1800);	//1800 = 60초*30 = 30분간 가지고 있는다.
			cookie_flag.setMaxAge(1800);
			
			response.addCookie(login_id);
			response.addCookie(cookie_flag);
		
			
		%>
		
		<a href="cookieGet.jsp"> 쿠키 저장 확인 </a>
	
	
	</body>
</html>