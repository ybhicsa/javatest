<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<%
		String id = "aaa";
		String pw = "1111";
		//String name = "김구";
		String name = URLEncoder.encode("김구","utf-8");
	%>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function sendLink(){
				alert("테스트");
				
				location.href="resilt.jsp?id=<%=id%>&pw=<%=pw%>&name=<%=name%>";
				
			}
		</script>
		
		
	</head>
	<body>
	
	
		<% 
			//response.sendRedirect("result.jsp?id="+name+"&id="+id+"&pw="+pw);		
		%>	
		<%-- <jsp:forward page="resilt.jsp">
			<jsp:param value="<%=id %>" name="id"/>
			<jsp:param value="<%=pw %>" name="pw"/>
			<jsp:param value="<%=name %>" name="name"/>
	
		</jsp:forward>  --%>
		
		
		<br>
		<a href="resilt.jsp?id=<%=id%>&pw=<%=pw%>&name=<%=name%>">데이터 전송</a> 
		<br><br>
		<button type="button" onclick="sendLink()" >파라미터 전송</button>
	
	
	</body>
</html>