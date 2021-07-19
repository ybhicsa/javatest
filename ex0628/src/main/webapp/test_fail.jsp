<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>불합격</title>
		
		<style type="text/css">
			h3{ color: red; }
		</style>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		%>
		<h3>시험번호 : <%=request.getParameter("number") %></h3>
		<h3>이름 : <%=request.getParameter("name") %></h3>
		<h3>점수 : <%=request.getParameter("Score") %></h3>
		<h3>불합격 입니다! </h3>
	</body>
</html>