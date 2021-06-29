<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>삭제 확인 페이지</title>
	</head>
	<body>
		<%
			Cookie[] cookiesAll = request.getCookies();
		
			for(int i=0;i<cookiesAll.length;i++){
				
				if(i==0){
					continue;
				}
				
				String cookieName = cookiesAll[i].getName();
				String coolieValue = cookiesAll[i].getValue();
				
				out.println(i+"쿠키  : "+ cookieName + ", ");
				out.println( coolieValue + "<br>");
				
				if(cookiesAll[i].getName().equals("cookie_flag")){
					
					out.print("로그인이 되었습니다.");
					
				} 
				
				//삭제
				cookiesAll[i].setMaxAge(0);
				response.addCookie(cookiesAll[i]);
				
			}
		%>
		
		<a href="cookalldle.jsp">다 삭제</a>		
	</body>
</html>