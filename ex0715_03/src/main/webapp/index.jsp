<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인페이지</title>
		<style type="text/css">
			div{border: 1px solid black; width: 400px; height: 60px;
				text-align: center;
			}
		</style>
		<%
			request.setCharacterEncoding("utf-8");
			String id = (String)session.getAttribute("sessId");
		%>
	</head>
	<body>
		<div><h3>메인 페이지</h3></div>
		
			<% 
			//if(session.getAttribute("session_flag").equals("success")){
			if(session.getAttribute("sess_fl")==null){
			%>
				<ul>
					<li><a href="./login.jsp">로그인</a></li>
					<li><a href="./member.jsp">회원가입</a></li>
				</ul>
			<%
			} else {			
			%>	
			<h3> <%= session.getAttribute("sessNk") %>님이 로그인 되었습니다.</h3>
				<ul>
					<li><a href="./logout.jsp">로그아웃</a></li>
					<li><a href="./list.jsp">게시판</a></li>
					<li><a href="./modify.jsp">회원정보 변경</a></li>
				</ul>
			<%	
			}
			%>
	
	
	
	</body>
</html>