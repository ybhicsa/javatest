<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- index 로그인 전, 로그인 후 >> login.jsp >> index.jsp >> logout.jsp -->
	<%
	String s_flag = (String)session.getAttribute("s_flag");
	
	if(s_flag != null){
		if(s_flag.equals("succese")){
	%>
			<a href="./logout.jsp"><img src="../images/login.jpg"></a>
	<%	
		}
	
	} else {
	%>
		<a href="./login.jsp"><img src="../images/logout.jpg"></a>
	<%	
	}
	
	%>
	
	
	
	
	</body>
</html>