<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>합격</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			
		String a = request.getParameter("number");
			
		%>
		<h3>시험번호 : <%=a %></h3>
		<h3>이름 : <%=request.getParameter("name") %></h3>
		<h3>점수 : <%=request.getParameter("Score") %></h3>
		<h3>성공여부 : <%=request.getParameter("param_test") %></h3>
		<h3>합격 입니다! </h3>
		
	</body>
</html>