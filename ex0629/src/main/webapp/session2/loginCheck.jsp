<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 체크</title>
	</head>
	<body>
		<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("aaa") && pw.equals("1234")){
			
			session.setAttribute("s_flag", "succese");
			
			response.sendRedirect("./index.jsp");
		}else{
			
			response.sendRedirect("./login.jsp?s_flag=fail");
		}
		
		%>
	
	
	</body>
</html>