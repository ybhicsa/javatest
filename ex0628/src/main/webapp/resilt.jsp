<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<style type="text/css">
			table, tr, td, th { border: 1px solid black; border-collapse: collapse;}
		
		</style>
		
	</head>
	<body>
		
		<%
			request.setCharacterEncoding("utf-8");
		%>
		<%-- <h3>아이디 : <%=request.getParameter("id") %></h3>
		<h3>비번 : <%=request.getParameter("pw") %></h3>
		<h3>이름 : <%=request.getParameter("name") %></h3>
		<h3>정보</h3> --%>
		
		<table>
			<tr>
				<th>아이디</th>
				<td><%=request.getParameter("id") %></td>
			</tr>
			<tr>
				<th>비번</th>
				<td><%=request.getParameter("pw") %></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><%=request.getParameter("name") %></td>
			</tr>
			
		
		</table>
		
	</body>
</html>