<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>form2</title>
		
		<style type="text/css">
			table , td { border: 1px solid black; border-collapse: collapse;}
		</style>
		
	</head>
	<body>
	
		<%
			request.setCharacterEncoding("utf-8");
		
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			
			
		%>
		<table>
			<tr>
				<td>아이디</td>
				<td><%=id%></td>
			</tr>
			<tr>
				<td>비번</td>
				<td><%=pw%></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=name%></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%=gender%></td>
			</tr>
		
		</table>
	
	
	
		<form action="./form2_update.jsp" name="form">
			<input type="hidden" id="id" name="id" value="<%=id%>"> <br>
			<input type="hidden" id="pw" name="pw" value="<%=pw%>"> <br>
			<input type="hidden" id=name name="name" value="<%=name%>"> <br>
			<input type="hidden" id=gender name="gender" value="<%=gender%>">  <br>
			<input type="submit" value="전송"> 
		</form>
	</body>
</html>