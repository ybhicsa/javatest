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
		String login_id = (String)session.getAttribute("login_id");		
		out.print("login_id : " + login_id+"<br>");
		
		String login_nName = (String)session.getAttribute("login_nName");		
		out.print("login_nName : " + login_nName+"<br>");
		
		String login_flag = (String)session.getAttribute("login_flag");		
		out.print("login_flag : " + login_flag+"<br>");
	%>
	</body>
</html>