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
		
		if(session.getAttribute("login_id") == null){
			
			out.println("login_id 색션이 없습니다");
			
		} else { 
			
			out.println("login_id 색션이 있습니다");
			
		}
		
		session.invalidate();
			
		
		%>
		
		<a href="./sessionResult2.jsp">섹션 모두 삭제한 결과</a>
	
	
	</body>
</html>