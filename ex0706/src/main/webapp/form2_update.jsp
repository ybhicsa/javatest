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
			request.setCharacterEncoding("utf-8");
		
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			
			
		%>
		<table>
		
		
		</table>
	
	
	
		<form action="./formok2.jsp" name="form">
			<input type="text" id="id" name="id" value="<%=id%>"> <br>
			<input type="text" id="pw" name="pw" value="<%=pw%>"> <br>
			<input type="text" id=name name="name" value="<%=name%>"> <br>
			<input type="radio" id=gender name="gender" value="<%=gender%>" 
			<%=(gender.equals("male")? "checked":"") %>>남자 <br>
			<input type="radio" id=gender name="gender" value="<%=gender%>"
			<%=(gender.equals("female")? "checked":"") %>>여자 <br>
			<input type="submit" value="저장"> 
		</form>
	</body>
</html>