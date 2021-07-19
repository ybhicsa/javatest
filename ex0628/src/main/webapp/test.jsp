<%@page import="java.net.URLEncoder"%>
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
			
			//String name = URLEncoder.encode(request.getParameter("name"),"utf-8");
			String name = request.getParameter("name");
			
			int number = Integer.parseInt(request.getParameter("number"));
			
			int Score= Integer.parseInt(request.getParameter("Score"));
		
			
			if(Score>=60){
		%>	
			<h3>heml코드</h3>
			<jsp:forward page="test_success.jsp" >
				<jsp:param value="<%=number %>" name="number"/>
				<jsp:param value="<%=name %>" name="name"/>
				<jsp:param value="<%=Score %>" name="Score"/>
				<jsp:param value="성공" name="param_test"/>
			
			</jsp:forward>
		<%		//response.sendRedirect("test_success.jsp?name="+name+"&number="+number+"&Score="+Score);
			 	
			} else {
				//response.sendRedirect("test_fail.jsp?name="+name+"&number="+number+"&Score="+Score);
			}
			
			
			
		%>
	
	
	
	</body>
</html>