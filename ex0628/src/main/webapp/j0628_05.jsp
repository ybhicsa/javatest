<%@page import="java.net.URLEncoder"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp:forward-param</title>
	</head>
	<body>
	
		<%
		String id = "aaa";
		String pw = "1111";
		//String name = "김구";	
		request.setCharacterEncoding("utf-8");
	
		%>
	
		<jsp:forward page="resilt.jsp">
			<jsp:param value="<%=id %>" name="id"/>
			<jsp:param value="<%=pw %>" name="pw"/>
			<jsp:param value="김영빈" name="name"/>
	
		</jsp:forward> 
	
	</body>
</html>