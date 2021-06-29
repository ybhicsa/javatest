<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	
		<ul>
			<!-- localhost:8181/ex0629/login/index.jsp -->
			<%
				Cookie[] cookieAll = request.getCookies();
			
				int count=0;
				if(cookieAll != null){//쿠기가 있는지 확인
					
					for(int i=0;i<cookieAll.length;i++){
						if(cookieAll[i].getValue().equals("success")){	//로그인시
							count=1;
						%>
							<li><a href="./logout.jsp">로그아웃</a></li>
							<li>게시판</li>
							<li>이벤트</li>
							<li>공지사항</li>
						<%
						}//if
					}//for
				}//if

				if(count == 0){	//로그인이 안된상태
				%>	
					<!-- 로그인 전 -->
					<li><a href="./login.jsp">로그인</a></li>
				<%	
					
				}
			
			%>

				<li><a href="./index.jsp">index</a></li>
				<li>공지사항</li>
			
		</ul>
	
	
	</body>
</html>